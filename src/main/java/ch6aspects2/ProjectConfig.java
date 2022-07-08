package ch6aspects2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "ch6aspects2")
@EnableAspectJAutoProxy
public class ProjectConfig {
}
