public class StepTracker {
    private int minSteps, activeDays, days, steps;

    public StepTracker(int minSteps) {
        this.minSteps = minSteps;
        activeDays = 0;
        days = 0;
        steps = 0;
    }

    public int getDays() {return days;}
    public int getActiveDays() {return activeDays;}
    public int getTotalSteps() {return steps;}
    public int getMinSteps() {return minSteps;}
    public int getStepsForActiveDay() {return minSteps;}

    public int activeDays() {
        return activeDays;
    }

    public void addDailySteps(int steps) {
        if (steps >= minSteps) {
            activeDays++;
        }
        days++;
        this.steps += steps;
    }

    public double averageSteps() {
        if (days == 0) return (float) 0;
        return (double) steps / days;
    }
}
