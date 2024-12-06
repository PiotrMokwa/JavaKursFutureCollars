package Lesson9.Task3;
public class Main {
    public static void main(String[] args){
        PeterList<String> peterList = new PeterList<>(String.class);
        System.out.println(peterList.add("2"));
        peterList.display();
        System.out.println(peterList.add("4"));
        peterList.display();
        System.out.println(peterList.add("6"));
        peterList.display();
        System.out.println();
        System.out.println(" Get: " + peterList.get(1));
        System.out.println("Removed :" + peterList.remove("8"));
        peterList.display();
        System.out.println();
        System.out.println(peterList.size());
        System.out.println(peterList.contains("8"));
    }
}
