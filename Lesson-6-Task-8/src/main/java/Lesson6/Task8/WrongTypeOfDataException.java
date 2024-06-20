package Lesson6.Task8;

import java.io.IOException;

public class WrongTypeOfDataException extends IOException {
    public WrongTypeOfDataException(String message){
        super(message);
    }
}
