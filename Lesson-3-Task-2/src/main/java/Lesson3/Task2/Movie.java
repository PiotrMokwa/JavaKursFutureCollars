package Lesson3.Task2;

public class Movie {
    protected String title;
    protected String DirectorName;
    protected String DirectorLastName;
    protected int movieTime;
    protected int productionYear;
    protected Movie(int movieTime,int productionYear) {
        this.movieTime = movieTime;
        this.productionYear = productionYear;
    }
}
