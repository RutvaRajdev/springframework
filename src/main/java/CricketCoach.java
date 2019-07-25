public class CricketCoach implements Coach {



    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("Inside cricket coach default constructor");
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    private String name;

    public void setTeam(String team) {
        this.team = team;
    }

    private String team;

    public CricketCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice 5 overs worth bowling in the nets";
    }

    @Override
    public String getDailyFortune() {
        return "Cricket coach:"+fortuneService.getFortune();
    }

    public void setName(String name) {
        this.name = name;
    }
}
