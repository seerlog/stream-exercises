package org.example.mission.e;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class E_Answer {

    // 1. 문자열 배열 String[] strArr = {"aaa","bb","c","dddd"}의 모든 문자열의 길이를 더한 결과를 출력하여라.
    public void sumOfLengths() {
        int sum = Stream.of("aaa", "bb", "c", "dddd")
                .mapToInt(String::length)
                .sum();
        System.out.println(sum);
    }

    // 2. 문자열 배열 String[] strArr = {"aaa","bb","c","dddd"}의 문자열 중에서 가장 긴 것의 길이를 출력하시오.
    public void longestLength() {
        int max = Stream.of("aaa", "bb", "c", "dddd")
                .mapToInt(String::length)
                .max()
                .getAsInt();
        System.out.println(max);
    }

    // 3. 임의의 로또번호(1~45)를 정렬해서 출력하시오.
    public void sortedLottoNumbers() {
        Stream.generate(() -> (int) (Math.random() * 45) + 1)
                .distinct()
                .limit(6)
                .sorted()
                .forEach(System.out::println);
    }

    // 4. 두 개의 주사위를 굴려서 나온 눈의 합이 6인 경우를 모두 출력하시오.
    public void diceSumOfSix() {
        IntStream.rangeClosed(1, 6)
                .boxed()
                .flatMap(i -> IntStream.rangeClosed(1, 6).mapToObj(j -> Pair.of(i,j)))
                .filter(pair -> pair.getLeft() + pair.getRight() == 6)
                .forEach(pair -> System.out.println("[" + pair.getLeft() + ", " + pair.getRight() + "]"));
    }

}
