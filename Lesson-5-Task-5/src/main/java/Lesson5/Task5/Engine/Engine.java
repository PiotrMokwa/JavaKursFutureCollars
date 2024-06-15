package Lesson5.Task5.Engine;
public interface Engine {
     default boolean startEngine(boolean engineStarted) {
        if (!engineStarted) {
            return engineStarted = true;
        }
        return false;
    }
    default boolean stopEngine(boolean engineStarted) {
        if (engineStarted) {
            return engineStarted = false;
        }
        return true;
    }
    default boolean isEngineStarted(boolean engineStarted) {
         return engineStarted;
    }
}
