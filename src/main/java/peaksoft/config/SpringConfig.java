package peaksoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import peaksoft.Car;

@Configuration
@ComponentScan("peaksoft")
@PropertySource("classpath:application.properties")
public class SpringConfig {
    public Car car(){
        return new Car();
    }
@Bean
    public String getName(){
        return new String();
    }

}
