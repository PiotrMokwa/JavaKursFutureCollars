package Lesson3.Task2;

public class Main {
    public static void main(String[] args){
        Movie Gladiator = new Movie(155,2000);
        Gladiator.title="Gladiator";
        Gladiator.DirectorName = "Ridley";
        Gladiator.DirectorLastName = "Scott";
        System.out.println("I'am watching "
                + Gladiator.title
                + " directed by "
                + Gladiator.DirectorName
                + " "
                + Gladiator.DirectorLastName);
        System.out.println("Movie was directed in "
                + Gladiator.productionYear +  " year"
                + " and lasts "
                + Gladiator.movieTime + " minutes");
    }
}
