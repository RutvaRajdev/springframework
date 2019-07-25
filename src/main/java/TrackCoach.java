public class TrackCoach implements Coach{

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Run 5 miles";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
