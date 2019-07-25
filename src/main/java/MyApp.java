public class MyApp {
    public static void main(String[] args) {

        // Create Object
        Coach TrackCoach = new TrackCoach(new HappyFortuneService());

        // Use object
        System.out.println(TrackCoach.getDailyWorkout());
    }
}
