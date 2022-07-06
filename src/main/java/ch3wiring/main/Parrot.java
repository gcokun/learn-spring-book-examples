package ch3wiring.main;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class Parrot {
    private String name;

    @Override
    public String toString() {
        return "Parrot: " + getName();
    }
}
