import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Bettayeb on 5/18/2017.
 */
public class Main {

    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        System.out.println(((Person)context.getBean("person")).toString());
    }
}
