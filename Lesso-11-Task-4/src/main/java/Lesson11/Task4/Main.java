package Lesson11.Task4;
import java.util.*;
import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {
        List<String> hospitalDoctorSpecialisation = List.of(
                "Szpital:Chirurg:Radiolog:Chirurg Szczękowy:Pediatra"
                , "Przychodnia:Pediatra"
                , "Przychodnia:Internista:Laryngolog:Pediatra"
        );
        getSpecialisations(hospitalDoctorSpecialisation);
    }
    public static void getSpecialisations(List<String> list ){
        list.stream()
                .flatMap(laneString ->
                        Stream.of(laneString.split(":"))
                                .filter(string ->
                                        !(
                                                string.equals("Szpital") || string.equals("Przychodnia")
                                        )
                                )
                )
                .forEach(specialisation -> System.out.print(specialisation + ", "));
    }
}
