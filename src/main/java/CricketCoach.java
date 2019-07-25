public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public CricketCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice 5 overs worth bowling in the nets";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
