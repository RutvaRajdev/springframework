import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {
        ApplicationContext context =
                new FileSystemXmlApplicationContext("src/beanScope-applicationContext.xml");

        Coach theCoach = context.getBean("myTrackCoach", Coach.class);

        Coach alphaCoach = context.getBean("myTrackCoach", Coach.class);

        // Check if the beans are same
        boolean result = (theCoach == alphaCoach);

        System.out.println("Same Object:? "+result);
        System.out.println("Memory location for theCoach: "+ theCoach);
        System.out.println("Memory location for alphaCoach: "+ alphaCoach);

    }
}
