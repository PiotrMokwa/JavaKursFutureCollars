package Lesson9.Task2;
import Lesson9.OwnQueue;
import java.util.Objects;
public class PeterQueue implements OwnQueue {
    private Integer[] queue;
        public PeterQueue(Integer value) {
            this.queue = new Integer[1];
            this.queue[0] = value;
        }
        @Override
        public boolean add(Integer e) {
            int newQueueSize = queue.length + 1;
            int newQueueLastIndex = newQueueSize - 1;
            Integer[] newQueue = new Integer[newQueueSize];
            System.arraycopy(this.queue, 0, newQueue, 0, this.queue.length);
            newQueue[newQueueLastIndex] = e;
            this.queue = newQueue;
            boolean isNewElementAdded = Objects.equals(this.queue[newQueueLastIndex], e);
            return isNewElementAdded;
        }
        @Override
        public Integer remove() {
            Integer firstElement = this.queue[0];
            int newQueueSize = queue.length - 1;
            Integer[] newQueue = new Integer[newQueueSize];
            System.arraycopy(this.queue, 1, newQueue, 0, this.queue.length - 1);
            this.queue = newQueue;
            return firstElement;
        }
        @Override
        public Integer element() {
            return this.queue[0];
        }
        public void display() {
            for (Integer element : this.queue) {
                System.out.print(element + " ");
            }
            System.out.println(" ");
            System.out.println("--------------------------");
        }
}
