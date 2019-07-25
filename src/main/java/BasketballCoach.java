public class BasketballCoach implements Coach {
    FortuneService fortuneService;

    BasketballCoach() {
        //System.out.println("Inside Basketball coach default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice for 1 hour today";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService theFortuneService) {
        //System.out.println("Inside set fortune in basketball coach");
        this.fortuneService = theFortuneService;
    }
}
