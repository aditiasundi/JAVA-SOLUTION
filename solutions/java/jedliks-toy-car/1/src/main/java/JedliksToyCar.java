public class JedliksToyCar {

    private int distance;
    private int battery;

    public JedliksToyCar() {
        distance = 0;
        battery = 100;
    }

    // Task 1
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    // Task 2
    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    // Task 3
    public String batteryDisplay() {
        if (battery == 0) {
            return "Battery empty";
        }

        return "Battery at " + battery + "%";
    }

    // Task 4, 5 & 6
    public void drive() {
        if (battery > 0) {
            distance += 20;
            battery--;
        }
    }
}
