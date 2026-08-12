class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4 };
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int birds : birdsPerDay) {
            if (birds == 0) {
                return true;
            }
        }
        return false;
    }

   public int getCountForFirstDays(int numberOfDays) {
    int counts = 0;

    int days = Math.min(numberOfDays, birdsPerDay.length);

    for (int i = 0; i < days; i++) {
        counts += birdsPerDay[i];
    }

    return counts;
}

    public int getBusyDays() {
        int count = 0;

        for (int birds : birdsPerDay) {
            if (birds >= 5) {
                count++;
            }
        }

        return count;
    }
}
