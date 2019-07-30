import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BeanLifecycleDemoApp {

    public static void main(String[] args) {
        ApplicationContext context =
                new FileSystemXmlApplicationContext("src/beanLifecycle-applicationContext.xml");

        Coach theCoach = context.getBean("myTrackCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

    }
}
