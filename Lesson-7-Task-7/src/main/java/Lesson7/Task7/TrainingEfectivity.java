package Lesson7.Task7;
public class TrainingEfectivity {
    private final TrainingScore score;
    public TrainingEfectivity(TrainingScore score) {
        this.score = score;
    }
    public double getTotalScore() {
        int timeLengthWeight = 1;
        int caloriesWeight = 2;
        int heartRatingWeight = 3;
        int meter = score.getTimeLengthRating() * timeLengthWeight
                + score.getCaloriesBurnedRating() * caloriesWeight
                + score.getAverageHeartRateRating() * heartRatingWeight;
        int weight = timeLengthWeight + caloriesWeight + heartRatingWeight;
        return (double) Math.round(((double) meter / weight) * 100) / 100;
    }
    public String getEffectivity() {
        double totalScore = getTotalScore();
        final String partOfMessage = "training effectivity";
        if (totalScore < 1.2) {
            return "Low " + partOfMessage;
        } else if (totalScore < 2) {
            return "Good " + partOfMessage;
        } else if (totalScore < 3) {
            return "Very good " + partOfMessage;
        } else {
            return "Excellent " + partOfMessage;
        }
    }
}
