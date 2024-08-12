package peaksoft;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")// не обьязательно
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Car {
    private Long id;
@Value("${brand}")
    private String brand;
    //Поля менен
    @Autowired
    @Qualifier("person")
    private Person person;

    //через конструктор бин тузуу, слабо зависимый болуп калды
    @Autowired
    public Car(@Qualifier("person") Person person) {
        this.person = person;
    }

    //Setter менен слабо зависимый
    @Autowired
    @Qualifier("person")
    public void setPerson(Person person) {
        this.person = person;
    }
@PostConstruct
    public void initMethod(){
        System.out.println("initMethod");
    }
    @PreDestroy
    public void destroyMethod(){
        System.out.println("destroyMethod");
    }
}
