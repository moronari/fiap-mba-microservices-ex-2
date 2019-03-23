package br.com.fiap.microservicesexemplo1;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String firstName;

    private String lastName;
}
