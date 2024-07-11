package Lesson9.Task4;
public class Main {
    public static void main(String[] args){
        Pair<String> pair = new Pair<>("Peter","Tomm");
       System.out.println(pair.getValueK());
       System.out.println(pair.getValueV());
       Pair<Integer> secondPair = new Pair<>(1,2);
       System.out.println(secondPair.getValueK());
       System.out.println(secondPair.getValueV());
    }
}
