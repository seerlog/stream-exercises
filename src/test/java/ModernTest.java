import org.junit.jupiter.api.Test;

import java.util.stream.LongStream;

public class ModernTest {

    @Test
    void 순차_스트림_공유값_테스트() {
        Accumulator accumulator = new Accumulator();
        LongStream.rangeClosed(1, 100).forEach(accumulator::add);
        System.out.println(accumulator.total);
    }

    @Test
    void 병렬_스트림_공유값_버그_테스트() {
        Accumulator accumulator = new Accumulator();
        LongStream.rangeClosed(1, 100).parallel().forEach(accumulator::add);
        System.out.println(accumulator.total);
    }

    public static class Accumulator {
        public long total = 0;
        public void add(long value) {
            total += value;
        }
    }
}
