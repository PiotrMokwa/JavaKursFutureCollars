package Lesson9.Task3;
import java.lang.reflect.Array;
public class PeterList<E> implements OwnList<E> {
    public E[] array;
    public Class<E> className;
    @SuppressWarnings("unchecked")
    public PeterList(Class<E> className) {
        this.array = (E[]) Array.newInstance(className, DEFAULT_CAPACITY);
        System.out.println();
        this.className = className;
    }
    @SuppressWarnings("unchecked")
    @Override
    public boolean add(E o) {
        E[] newArray = (E[]) Array.newInstance(className, this.array.length + 1);
        System.arraycopy(this.array, 0, newArray, 0, newArray.length - 1);
        this.array = newArray;
        int arrayIndexCounter = 0;
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[arrayIndexCounter] == null) {
                this.array[arrayIndexCounter] = o;
                boolean isElementAdded = this.array[arrayIndexCounter] == o;
                System.out.println();
                return isElementAdded;
            }
            arrayIndexCounter++;
        }
        return false;
    }
    @Override
    public E get(int index) {
        int arrayIndexCounter = 0;
        for (int i = 0; i < this.array.length; i++) {
            if (arrayIndexCounter == index) {
                return this.array[arrayIndexCounter];
            }
            arrayIndexCounter++;
        }
        return null;
    }
    @SuppressWarnings("unchecked")
    @Override
    public boolean remove(E o) {
        if (contains(o)) {
            E[] newArray = (E[]) Array.newInstance(className, this.array.length - 1);
            int elementIndexPointer = -1;
            int oldArrayIndexCounter = 0;
            for (int i = 0; i < this.array.length - 1; i++) {
                if (this.array[oldArrayIndexCounter] == o) {
                    elementIndexPointer = oldArrayIndexCounter;
                } else {
                    int decrementOldArrayIndex = elementIndexPointer != -1 ? 1 : 0;
                    newArray[oldArrayIndexCounter - decrementOldArrayIndex] = this.array[oldArrayIndexCounter];
                }
                oldArrayIndexCounter++;
            }
            this.array = newArray;
            if (elementIndexPointer != -1) {
                return this.array[elementIndexPointer] != o;
            }
        }
        return false;
    }
    @Override
    public int size() {
        return this.array.length;
    }
    public void display() {
        int i = 0;
        for (E element : this.array) {
            System.out.print(" |nr." + i + " el: " + element + "|");
            i++;
        }
    }
    public boolean contains(E elementToFind) {
        boolean isElement;
        for (E element : this.array) {
            isElement = element == elementToFind;
            if (isElement) {
                return true;
            }
        }
        return false;
    }
}

