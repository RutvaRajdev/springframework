

public class BaseballCoach implements Coach {

    // Define a private field for dependency
    private FortuneService fortuneService;

    // Define constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout () {
        return "Spend 30 mins on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
