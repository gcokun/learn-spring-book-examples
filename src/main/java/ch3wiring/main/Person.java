package ch3wiring.main;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Data
@Component
public class Person {
    private final Parrot parrot;
    private String name = "Adsa";

    @Autowired
    //If you only have one constructor unneeded
    public Person(@Qualifier("parrot2") Parrot parrot1) {
        this.parrot = parrot1;
    }
}
