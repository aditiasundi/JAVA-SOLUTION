public class CarsAssemble {

    public double productionRatePerHour(int speed) {
         double carsPerHour = 221.0;

        if (speed >= 1 && speed <= 4) {
            return speed * carsPerHour;
        } else if (speed >= 5 && speed <= 8) {
            return speed * carsPerHour * 0.90;
        } else if (speed == 9) {
            return speed * carsPerHour * 0.80;
        } else if (speed == 10) {
            return speed * carsPerHour * 0.77;
        }

        return 0;
    }

    public int workingItemsPerMinute(int speed) {
                return (int) (productionRatePerHour(speed) / 60);

    }
}
