package Lesson3.Task1;
public class CinemaSeatPlaces {
    public int seatNumber;
    public int seatRowNumber;
    public boolean isEmpty;

    public CinemaSeatPlaces(int seatNumber,int seatRowNumber, boolean isEmpty){

        System.out.println("Seat " + seatNumber + " Row " + seatRowNumber + " is " + (isEmpty ? "Empty": "Busy"));
        this.seatRowNumber = seatRowNumber;
        this.seatNumber =seatNumber;
        this.isEmpty =isEmpty;
    }
}
