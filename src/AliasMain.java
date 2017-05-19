import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Bettayeb on 5/19/2017.
 */
public class AliasMain {

        public static void main(String[] args){
            ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
            System.out.println(((PersonWithAddress)context.getBean("person6")).toString());
        }

}
