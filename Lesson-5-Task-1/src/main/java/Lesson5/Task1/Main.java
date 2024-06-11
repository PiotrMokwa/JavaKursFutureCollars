package Lesson5.Task1;
    public class Main {
     public static void main(String[] args){
        TextOperations text = new TextOperations("Peter");
        System.out.println(text.hasChars());
            if(text.hasChars()){
                System.out.println(text.isPolyandry());
            }
            if(text.hasChars()){
             System.out.println(text.getTextLength());
            }
    }
}
