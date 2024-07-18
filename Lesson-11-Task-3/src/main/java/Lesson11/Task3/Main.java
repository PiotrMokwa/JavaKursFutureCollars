package Lesson11.Task3;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Set<Cinema> cinemasList = getCinemas();
        cinemasList.forEach(
                cinema ->
                        System.out.print(
                                " |" + cinema.cinemaHall + "|" + cinema.cinemaType + "|"
                        ));
        String cinemasTypeToFind = CinemaType.tooD.getCinemaType();
        System.out.println();
        System.out.println("We have "
                + getAmountOfCinemas(cinemasList, cinemasTypeToFind)
                + " cinemas type "
                + cinemasTypeToFind);
    }
    private static Set<Cinema> getCinemas() {
        int indexCinemaType = 0;
        Set<Cinema> cinemasList = new HashSet<>();
            for (int i = 0; i < 10; i++) {
                String cienamName = "Cinema nr" + (i + 1);
                CinemaType[] cinemaTypeArray = CinemaType.values();
                String singleCinemaType = cinemaTypeArray[indexCinemaType].getCinemaType();
                Cinema cinema = new Cinema(cienamName, singleCinemaType);
                indexCinemaType = indexCinemaType < 2 ? indexCinemaType + 1 : 0;
                cinemasList.add(cinema);
            }
        return cinemasList;
    }
    public static long getAmountOfCinemas(Set<Cinema> setOfCinemas, String cinemaType) {
        return setOfCinemas.stream()
                .filter(cinema -> cinema.cinemaType
                        .equals(cinemaType)).count();
    }
}
