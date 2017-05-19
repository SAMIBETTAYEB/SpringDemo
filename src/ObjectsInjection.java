import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Bettayeb on 5/18/2017.
 */
public class ObjectsInjection {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        System.out.println(((PersonWithAddress)context.getBean("person4")).toString());
    }
}
