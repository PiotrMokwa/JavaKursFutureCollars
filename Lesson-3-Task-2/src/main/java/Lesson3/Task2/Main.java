package Lesson3.Task2;
public class Main {
    public static void main(String[] args){
        Movie Gladiator = new Movie("Gladiator",
                "Ridley",
                "Scott.",
                155,
                2000);
        System.out.println("I'am watching "
                + Gladiator.title
                + " directed by "
                + Gladiator.directorName
                + " "
                + Gladiator.directorLastName);
        System.out.println("Movie was directed in "
                + Gladiator.productionYear +  " year"
                + " and lasts "
                + Gladiator.movieTime + " minutes.");
    }
}
