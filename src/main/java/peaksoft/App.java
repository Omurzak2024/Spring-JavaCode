package peaksoft;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import peaksoft.config.SpringConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext applicationContext=
                new AnnotationConfigApplicationContext(SpringConfig.class);
        Car car = applicationContext.getBean("car", Car.class);
//        Car car1= applicationContext.getBean("car", Car.class);
        System.out.println(car);
        applicationContext.close();
    }
}
