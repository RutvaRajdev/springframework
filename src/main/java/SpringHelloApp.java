import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;



public class SpringHelloApp {

    public static void main(String[] args) {
        // Load spring config file
        ApplicationContext context =
                new FileSystemXmlApplicationContext("src/applicationContext.xml");

        // Retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // Call methods on the bean
        System.out.println(theCoach.getDailyWorkout());


    }
}
