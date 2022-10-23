package horse_race;

public class Main {


    public static void main(String[] args) {
        System.out.println("Wątek główny zaczyna działanie");
        for (int i = 3; i > 0; i--) {
            System.out.print(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException exception) {
                System.out.println("Wątek główny przerwany");
            }
        }
        Race horseRace = new Race(50);
        Timer raceTimer = new Timer(horseRace);
        Thread timer = new Thread(raceTimer);
        Thread horse1 = new Thread(new Horse("June", horseRace));
        Thread horse2 = new Thread(new Horse("Henry", horseRace));
        timer.start();
        horse1.start();
        horse2.start();
        while(!horseRace.isOver())
        try{
            Thread.sleep(1000);
            } catch (InterruptedException e) {
            System.out.println("Wątek główny przerwany");
        }
        if(horseRace.isOver()){
            horse1.interrupt();
            horse2.interrupt();
            timer.interrupt();
        }
    }
}
