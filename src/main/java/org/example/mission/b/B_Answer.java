package org.example.mission.b;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B_Answer {
    private final static List<String> WORDS = Arrays.asList("TONY", "a", "hULK", "B", "america", "X", "nebula", "Korea");

    // 1. List에 저장된 단어들의 접두사가 각각 몇개씩 있는지 Map<String, Integer>으로 변환하여라. ex) ("T", 1), ("a", 2), ...
    public void HowManyPrefixesAreThereForEach() {
        WORDS.stream()
                .map(word -> word.substring(0, 1))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
                .forEach((prefix, count) -> System.out.println(prefix + " : " + count));
    }

    // 2. List에 저장된 단어들 중에서 단어의 길이가 2 이상인 경우에만, 모든 단어를 대문자로 변환하여 스페이스로 구분한 하나의 문자열로
    // 합한 결과를 반환하여라. ex) ["Hello", "a", "Island", "b"] -> “H I”
    public void ConvertToUpperCaseAndJoin() {
        String result = WORDS.stream()
                .filter(word -> word.length() >= 2)
                .map(String::toUpperCase)
                .map(word -> word.substring(0, 1))
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }

}
