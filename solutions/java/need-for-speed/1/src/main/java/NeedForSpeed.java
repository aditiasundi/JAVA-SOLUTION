public class NeedForSpeed {

    private int speed;
    private int batteryDrain;
    private int distance;
    private int battery;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distance = 0;
        this.battery = 100;
    }

    public void drive() {
        if (!batteryDrained()) {
            distance += speed;
            battery -= batteryDrain;
        }
    }

    public int distanceDriven() {
        return distance;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    boolean canFinish(int raceDistance) {
        int numberOfDrives = 100 / batteryDrain;
        int maximumDistance = numberOfDrives * speed;

        return maximumDistance >= raceDistance;
    }
}

class RaceTrack {

    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return car.canFinish(distance);
    }
}