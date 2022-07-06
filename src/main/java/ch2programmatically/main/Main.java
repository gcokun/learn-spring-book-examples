package ch2programmatically.main;

import ch2stereotype.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot parrotViki = new Parrot();
        parrotViki.setName("Viki");

        Supplier<Parrot> parrotSupplier = () -> parrotViki;

        context.registerBean("viki", Parrot.class, parrotSupplier, parrot -> parrot.setPrimary(true));

        Parrot p = context.getBean(Parrot.class);

        System.out.println(p);
        System.out.println(p.getName());
    }
}
