package org.example.mission.a;

import lombok.*;

import java.util.Arrays;
import java.util.List;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private String introduction;
    private List<String> hobbies;

    public static User of(String name, String hobby, String introduction) {
        return User.builder()
                .name(name)
                .hobbies(Arrays.stream(hobby.split(":")).map(String::trim).toList())
                .introduction(introduction)
                .build();
    }
}
