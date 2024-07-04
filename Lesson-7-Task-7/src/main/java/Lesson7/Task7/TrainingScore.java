package Lesson7.Task7;
public class TrainingScore {
    private final int time;
    private final int calories;
    private final int heartRate;
    public TrainingScore(int trainingTime, int numberOfcaloriesBurned, int heartRate) {
        this.time = trainingTime;
        this.calories = numberOfcaloriesBurned;
        this.heartRate = heartRate;
    }
    public int getTimeLengthRating() {
        if (time < 30) {
            return 1;
        } else if (time <= 60) {
            return 2;
        } else {
            return 3;
        }
    }
    public int getCaloriesBurnedRating() {
        if (calories <= 300) {
            return 1;
        } else if (calories < 400) {
            return 2;
        } else {
            return 3;
        }
    }
    public int getAverageHeartRateRating() {
        if (heartRate < 160) {
            return 3;
        } else if (heartRate <= 175) {
            return 2;
        } else {
            return 1;
        }
    }
}
