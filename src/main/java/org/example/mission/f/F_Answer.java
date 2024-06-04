package org.example.mission.f;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class F_Answer {
    Student[] stuArr = new Student[]{
            new Student("나자바", true, 1, 1, 300),
            new Student("김지미", false, 1, 1, 450),
            new Student("김자바", true, 1, 1, 100),
            new Student("이지미", false, 1, 2, 550),
            new Student("남자바", true, 1, 2, 200),
            new Student("안지미", false, 1, 2, 150),
            new Student("황지미", false, 1, 3, 600),
            new Student("강지미", false, 1, 3, 350),
            new Student("이자바", true, 1, 3, 100),
            new Student("나자바", true, 2, 1, 400),
            new Student("김지미", false, 2, 1, 50),
            new Student("김자바", true, 2, 1, 100),
            new Student("이지미", false, 2, 2, 550),
            new Student("남자바", true, 2, 2, 600),
            new Student("안지미", false, 2, 2, 450),
            new Student("황지미", false, 2, 3, 200),
            new Student("강지미", false, 2, 3, 100),
            new Student("이자바", true, 2, 3, 700)
    };

    // 1. stuArr에서 불합격(150점 미만)한 학생의 수를 남자와 여자로 구별하여라. (Boolean, List)
    public void getNumberOfFailStudents() {
        Stream.of(stuArr)
                .filter(s -> s.getScore() < 150)
                .collect(Collectors.partitioningBy(Student::isMale, Collectors.counting()))
                .forEach((k, v) -> System.out.println((k ? "남자" : "여자") + " : " + v + "명"));
    }

    // 2. 각 반별 총점을 학년 별로 나누어 구하여라 (Map<Integer, Map<Integer, Integer>>)
    public void getTotalScoresByGrade() {
        Stream.of(stuArr)
                .collect(Collectors.groupingBy(Student::getHak,
                        Collectors.groupingBy(Student::getBan,
                                Collectors.summingInt(Student::getScore))))
                .forEach((k, v) -> {
                    System.out.println(k + "학년");
                    v.forEach((k2, v2) -> System.out.println(k2 + "반 : " + v2 + "점"));
                });
    }

}
