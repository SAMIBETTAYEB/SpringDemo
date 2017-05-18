import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Bettayeb on 5/18/2017.
 */
public class ConstructorInjectionMain {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("Using constructor-arg (default):");
        System.out.println(((Person)context.getBean("person1")).toString());
        System.out.println("Using constructor-arg type:");
        System.out.println(((Person)context.getBean("person2")).toString());
        System.out.println("Using constructor-arg index:");
        System.out.println(((Person)context.getBean("person3")).toString());
    }
}
