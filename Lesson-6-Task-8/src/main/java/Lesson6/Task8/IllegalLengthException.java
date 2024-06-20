package Lesson6.Task8;

import java.io.IOException;

public class IllegalLengthException extends IOException {
    public IllegalLengthException(String message){
        super(message);
    }
}
