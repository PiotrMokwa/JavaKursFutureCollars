package Lesson4.Task5;

import Lesson4.Animal;

public class Birds extends Animal {

    public Birds(String AnimalName) {
        super(AnimalName);
    }

    protected String getBirdsName(){
        return super.animalName;
    }
}
