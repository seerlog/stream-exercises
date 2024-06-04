package org.example.mission.c;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C_Answer {
    private static final List<Integer> numbers1 = Arrays.asList(1, 2, 3);
    private static final List<Integer> numbers2 = Arrays.asList(3, 4);

    // 1. 위와 같은 숫자 리스트가 있을 때 모든 숫자 쌍의 배열 리스트를 반환하여라.
    // ex) numbers1 = [1,2,3], numbers2 = [3,4] -> [(1,3), (1,4), (2,3), (2,4), (3,3), (3,4)]
    public void getArrayListOfAllNumberPairs() {
        List<Pair<Integer, Integer>> result = numbers1.stream()
                .map(number1 -> numbers2.stream().map(number2 -> Pair.of(number1, number2)).collect(Collectors.toList()))
                .flatMap(List::stream)
                .toList();
        System.out.println(result);
    }

    // 2. 위와 같은 숫자 리스트가 있을 때 모든 숫자 쌍의 곱이 가장 큰 값을 반환하여라.
    // ex) numbers1 = [1,2,3], numbers2 = [3,4] -> 12
    public void getLargestProductOfAllNumberPairs() {
        numbers1.stream()
                .map(number1 -> numbers2.stream().map(number2 -> Pair.of(number1, number2)).collect(Collectors.toList()))
                .flatMap(List::stream)
                .reduce((pair1, pair2) -> pair1.getLeft() * pair1.getRight() > pair2.getLeft() * pair2.getRight() ? pair1 : pair2)
                .ifPresent(pair -> System.out.println(pair.getLeft() * pair.getRight()));
    }

}
