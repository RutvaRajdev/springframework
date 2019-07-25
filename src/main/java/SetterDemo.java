import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SetterDemo {

    public static void main(String[] args) {
        // Load spring config file
        ApplicationContext context =
                new FileSystemXmlApplicationContext("src/applicationContext.xml");

        // Retrieve bean from container
        Coach basketballCoach  = context.getBean("myBasketballCoach", BasketballCoach.class);

        // Call methods on bean
        System.out.println(basketballCoach.getDailyWorkout());
    }
}
