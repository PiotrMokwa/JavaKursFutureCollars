package Lesson11.Task3;

public enum CinemaType {
     tooD("2D")
    ,threeD("3D")
    ,fourD("4D");
   final String cinemaType;
        CinemaType(String cinemaType){
            this.cinemaType =cinemaType;
        }
        String getCinemaType(){
            return this.cinemaType;
        }

}
