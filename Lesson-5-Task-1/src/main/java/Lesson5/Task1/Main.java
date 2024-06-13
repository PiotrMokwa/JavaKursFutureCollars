package Lesson5.Task1;
    public class Main {
     public static void main(String[] args){
        TextOperations text = new TextOperations("Peter");
        System.out.println(text.isEmpty());
            if(text.isEmpty()){
                System.out.println(text.isPolyandry());
                System.out.println(text.getTextLength());
            }
    }
}
