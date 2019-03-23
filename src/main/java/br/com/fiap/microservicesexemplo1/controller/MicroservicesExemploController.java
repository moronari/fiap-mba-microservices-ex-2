package br.com.fiap.microservicesexemplo1.controller;

import br.com.fiap.microservicesexemplo1.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MicroservicesExemploController {
    @GetMapping("/exemplo-1/{firstName}/{lastName}")
    public ResponseEntity getHello(@PathVariable(value="firstName",required = true) String firstName,
                                   @PathVariable(value="lastName",required = true) String lastName){
        System.out.printf("Hello %s %s", firstName, lastName);

        log.info("Hello %s %s", firstName, lastName);

        return new ResponseEntity(HttpStatus.OK);

    }

    @GetMapping("/exemplo-1")
    public ResponseEntity getHello(Person person){

        log.info("Hello %s %s", person.getFirstName(), person.getLastName());

        return new ResponseEntity<>(person, HttpStatus.OK);

    }

}
