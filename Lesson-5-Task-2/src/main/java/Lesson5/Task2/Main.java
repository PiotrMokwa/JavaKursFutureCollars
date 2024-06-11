package Lesson5.Task2;
public class Main {
    public static void main(String[] args){
      String text1 = "Fizz";
      String text2 = "Buzzy";
        for(int i = 1; i < 101 ; i++){
            boolean divideBythree = i % 3 == 0;
            boolean divideByfive = i % 5 == 0;
                if ((divideByfive) && (divideBythree)) {
                    System.out.println(text1 + text2);
                 }
                 else if (divideBythree) {
                     System.out.println(text1);
                 }
                 else if (divideByfive) {
                     System.out.println(text2);
                 }
              else {
                  System.out.println(i);
              }
        }
    }
}
