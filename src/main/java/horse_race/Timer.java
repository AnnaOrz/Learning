package horse_race;

public class Timer implements Runnable {
    private final Race race;

    public Timer(Race race) {
        this.race = race;
    }

    @Override
    public void run() {
        System.out.println("\n" +"Wyścig się zaczyna!!");
        try {
            do {
                race.setTime(race.getTime() + 1);
                System.out.println(race.getTime()); //to do usunięcia
                Thread.sleep(1000); //to tutaj celowo jest!
            } while (!race.isOver());
        } catch (InterruptedException ex) {
            System.out.println("Wątek timer został przerwany");
        }
        System.out.println(race);
    }
}
