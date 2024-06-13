import org.junit.jupiter.api.Test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;

public class ForkJoinSumTest {

    @Test
    public void forkJoinSumTest() {
        long[] numbers = LongStream.rangeClosed(1, 1000).toArray();
        ForkJoinSumCalculator task = new ForkJoinSumCalculator(numbers);
        Long result = new ForkJoinPool().invoke(task);
        System.out.println(result);
    }

    public static class ForkJoinSumCalculator extends RecursiveTask<Long> {
        private final long[] numbers;
        private final int start;
        private final int end;
        public static final long THRESHOLD = 10_000;

        public ForkJoinSumCalculator(long[] numbers) {
            this(numbers, 0, numbers.length);
        }

        private ForkJoinSumCalculator(long[] numbers, int start, int end) {
            this.numbers = numbers;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Long compute() {
            int length = end - start;

            if(length <= THRESHOLD) {
                return computeSequentially();
            }

            ForkJoinSumCalculator leftTask = new ForkJoinSumCalculator(numbers, start, start + length / 2);
            leftTask.fork();
            ForkJoinSumCalculator rightTask = new ForkJoinSumCalculator(numbers, start + length / 2, end);
            Long rightResult = rightTask.compute();
            Long leftResult = leftTask.join();
            return leftResult + rightResult;
        }

        private long computeSequentially() {
            long sum = 0;
            for(int i = start; i < end; i++) {
                sum += numbers[i];
            }
            return sum;
        }
    }
}
