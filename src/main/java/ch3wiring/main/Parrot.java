package ch3wiring.main;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Parrot {
    private String name = "Kako";

    @Override
    public String toString() {
        return "Parrot: " + getName();
    }
}
