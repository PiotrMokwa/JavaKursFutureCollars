package Lesson3.Task1;

public class Main {
    public static void main(String[] args){
CinemaSeatPlaces cinemaCity = new CinemaSeatPlaces( 2,  4,true);

       System.out.println(cinemaCity.seatNumber );
       System.out.println(cinemaCity.seatRowNumber );
       System.out.println(cinemaCity.isEmpty );

       cinemaCity.isEmpty = false;
       System.out.println(cinemaCity.isEmpty );
    }
}
