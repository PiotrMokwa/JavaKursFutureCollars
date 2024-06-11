package Lesson5.Task1;
public class TextOperations {
   private final String textData;
        TextOperations(String textData){
            this.textData = textData;
        }
        boolean hasChars(){
            return this.textData != null;
        }
        boolean isPolyandry() {
            char[] textArray = textData.toCharArray();
            int forwardCounter = 0;
                for(int rewersCounter = textArray.length; rewersCounter > 0; rewersCounter--){
                    if(textArray[rewersCounter-1]!=textArray[forwardCounter]) {
                    return false;
                }
                    forwardCounter++;
             }
            return true;
        }
        int textLength(){
            return textData.length();
        }
}