package ch3wiring.config;

import ch3wiring.main.Parrot;
import ch3wiring.main.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ch3wiring.main")
public class ProjectConfig {

}
