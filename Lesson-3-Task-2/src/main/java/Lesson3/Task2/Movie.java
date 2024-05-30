package Lesson3.Task2;
public class Movie {
    protected String title;
    protected String directorName;
    protected String directorLastName;
    protected int movieTime;
    protected int productionYear;
    protected Movie(String title, String directorName, String directorLastName, int movieTime, int productionYear){
       this.title = title;
       this.directorName = directorName;
       this.directorLastName = directorLastName;
       this.movieTime = movieTime;
       this.productionYear = productionYear;
    }
}
