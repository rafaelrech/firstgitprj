package org.example;


import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Person {

    String id;
    String name;
    String lastName;
    LocalDateTime dob;

}
