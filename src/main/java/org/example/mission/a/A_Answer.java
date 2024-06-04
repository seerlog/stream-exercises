package org.example.mission.a;

import java.util.*;
import java.util.stream.Collectors;

public class A_Answer {
    private List<User> users;

    public A_Answer() {
        this.users = new Database().getUsers();
    }

    // 0. map 과 flatMap 의 차이
    public void map() {
        users.stream()
                .map(User::getHobbies)
                .toList()
                .forEach(System.out::println);
    }

    public void flatMap() {
        users.stream()
                .flatMap(user -> user.getHobbies().stream())
                .toList()
                .forEach(System.out::println);
    }

    // 1. 각 취미를 선호하는 인원이 몇 명인지 계산하여라.
    public void howManyPeoplePreferEachHobby() {
        users.stream()
                .flatMap(user -> user.getHobbies().stream())
                .collect(Collectors.groupingBy(hobby -> hobby, Collectors.counting()))
                .forEach((hobby, count) -> System.out.println(hobby + " : " + count));

    }

    // 2. 각 취미를 선호하는 정씨 성을 갖는 인원이 몇 명인지 계산하여라.
    public void howManyPeopleHaveTheSurnameJungWhoPreferEachHobby() {
        users.stream()
                .filter(user -> user.getName().contains("정"))
                .flatMap(user -> user.getHobbies().stream())
                .collect(Collectors.groupingBy(hobby -> hobby, Collectors.counting()))
                .forEach((hobby, count) -> System.out.println(hobby + " : " + count));
    }

    // 3. 소개 내용에 '좋아'가 몇번 등장하는지 계산하여라.
    public void howManyTimesTheWordLikeAppearsInIntroduction() {
        users.stream()
                .map(User::getIntroduction)
                .map(this::getLikeCount)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);
    }

    private int getLikeCount(String introduction) {
        String search = "좋아";
        int matchCount = 0;
        int slideLength = introduction.length() - search.length() + 1;

        for (int i = 0; i < slideLength; i++) {
            String cutStr = introduction.substring(i, i + search.length());
            if (cutStr.equals(search)) {
                matchCount++;
            }
        }

        return matchCount;
    }

}
