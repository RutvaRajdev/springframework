import java.util.Random;

public class RandomFortuneService implements FortuneService {
    String[] fortunes = new String[]{"Luck will be on your side!", "Work hard and it will pay off", "It will be a tough day"};

    Random rand = new Random();

    @Override
    public String getFortune() {
        return fortunes[rand.nextInt(3)];
    }
}
