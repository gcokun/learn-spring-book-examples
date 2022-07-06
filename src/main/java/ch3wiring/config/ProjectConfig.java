package ch3wiring.config;

import ch3wiring.main.Parrot;
import ch3wiring.main.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "ch3wiring.main")
public class ProjectConfig {
    @Bean
    @Primary
    Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Kako");
        return p;
    }

    @Bean
    Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Viki");
        return p;
    }

}
