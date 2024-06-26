package Lesson5.Task5;
import Lesson5.Task5.Engine.Engine;
import Lesson5.Vehicle;
public class Car extends Vehicle implements Engine {
    boolean engineStarted;
        public Car(boolean engineStarted){
            this.engineStarted = engineStarted;
        }
        @Override
        public boolean startEngine(boolean engineStarted) {
            return Engine.super.startEngine(engineStarted);
        }
        @Override
        public boolean isEngineStarted(boolean engineStarted) {
            return Engine.super.isEngineStarted(engineStarted);
        }
        @Override
        public boolean stopEngine(boolean engineStarted) {
            return Engine.super.stopEngine(engineStarted);
        }
}