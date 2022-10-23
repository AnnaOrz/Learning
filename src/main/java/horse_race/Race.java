package horse_race;

public class Race {
    private int time;
    private final int distance;
    private boolean over;

    public Race(int distance) {
        this.time = 0;
        this.over = false;
        this.distance = distance;
    }

    public int getTime() {
        return this.time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getDistance() {
        return this.distance;
    }

    public boolean isOver() {
        return over;
    }

    public synchronized void setOver(boolean over) {
        this.over = over;
    }

    @Override
    public String toString() {
        return "Wyścig o dystansie " + distance + " metrów zakończył się w czasie " + time + " sekund";
    }
}
