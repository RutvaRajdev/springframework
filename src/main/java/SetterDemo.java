import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SetterDemo {

    public static void main(String[] args) {
        // Load spring config file
        ApplicationContext context =
                new FileSystemXmlApplicationContext("src/applicationContext.xml");

        // Retrieve bean from container
        CricketCoach CricketCoach  = context.getBean("myCricketCoach", CricketCoach.class);

        // Call methods on bean
        System.out.println(CricketCoach.getDailyWorkout());
        System.out.println(CricketCoach.getName());
        System.out.println(CricketCoach.getTeam());
        System.out.println(CricketCoach.getDailyFortune());

    }
}
