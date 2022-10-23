package horse_race;

public class Horse implements Runnable {
    public final String name;
    public final Race race;
    private final double initialSpeed = Math.random()*10;
    private double recentSpeed = initialSpeed;
    private double distance = 0;

    public Horse(String name, Race race){
       this.name = name;
       this.race = race;
    }

    public String getName() {
        return name;
    }

    public double getRecentSpeed() {
        return recentSpeed;
    }

    public void setRecentSpeed(double recentSpeed) {
        this.recentSpeed = recentSpeed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
    public void addDistance(double distanceToAdd){
        this.distance = distance + distanceToAdd;
    }
    public void speedUp(){
        this.recentSpeed = this.recentSpeed * 1.1;
    }

    public double getInitialSpeed() {
        return initialSpeed;
    }

    @Override
    public void run() {
        System.out.println(name + "Rusza z kopyta!" + initialSpeed);
        while(distance < race.getDistance()){
            try {
                addDistance(recentSpeed);
                System.out.println(name + ": Ihaha! " + String.format("%.2f", distance));
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                System.out.println(name + " zatrzymuje się rozżalony");
                return;
            }
        }
        System.out.println(name + " kończy bieg!");
        race.setOver(true);
    }
}
