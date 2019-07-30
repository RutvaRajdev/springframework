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

    // Init method
    public void beanInitMethod() {
        System.out.println("TrackCoach inside the beanInit Method");
    }

    // Destroy method
    public void beanDestroyMethod() {
        System.out.println("TrackCoach inside the beanDestroy Method");
    }
}
