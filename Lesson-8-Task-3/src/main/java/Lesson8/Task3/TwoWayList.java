package Lesson8.Task3;
public class TwoWayList {
    Node list;
    public TwoWayList(int listLength) {
        Node nodeHead = new Node();
        Node beforeNodeHolder = new Node();
        this.list = nodeHead;
        int i = 0;
        do {
            if (i == 0) {
                nodeHead.data = " Peter " + i;
                nodeHead.nextReference = null;
                nodeHead.beforeReference = null;
                nodeHead.nodeNumber = i;
            } else {
                Node node = new Node();
                if (i == 1) {
                    node.beforeReference = nodeHead;
                    nodeHead.nextReference = node;
                } else {
                    node.beforeReference = beforeNodeHolder;
                    beforeNodeHolder.nextReference = node;
                }
                node.nodeNumber = i;
                node.data = " Peter " + i;
                beforeNodeHolder = node;
                node.nextReference = null;
            }
            i++;
        } while (i < listLength);
    }
    public void display() {
        System.out.print("| Nod nr." + this.list.nodeNumber
                + ":" + this.list.data + "|");
        Node pointer = this.list.nextReference;
            do {
                System.out.print("   | Nod nr." + pointer.nodeNumber
                        + ":" + pointer.data + "|");
                pointer = pointer.nextReference;
            } while (pointer != null);
        System.out.println();
    }
    public void add(String data) {
        Node pointer = this.list.nextReference;
            do {
                pointer = pointer.nextReference;
            } while (pointer.nextReference != null);
        Node newElement = new Node();
        pointer.nextReference = newElement;
        newElement.beforeReference = pointer;
        newElement.nextReference = null;
        newElement.data = data;
        newElement.nodeNumber = pointer.nodeNumber + 1;
    }
    public void add(int index, String data) throws IndexOutOfBoundsException {
        boolean isNotIndex = (size() < index + 1) || (index < 0);
            if (isNotIndex) {
                throw new IndexOutOfBoundsException(data + " Wasn't added");
            }
        Node pointer = this.list;
        Node pointerBefore = new Node();
        boolean elementWasAdded = false;
        boolean firstElement = index == 0;
        int i = 0;
                do {
                    if (i == index) {
                        Node newElement = new Node();
                        this.list = firstElement ? newElement : this.list;
                        pointerBefore.nextReference = firstElement ? null : newElement;
                        newElement.beforeReference = firstElement ? null : pointerBefore;
                        newElement.nextReference = pointer;
                        pointer.beforeReference = newElement;
                        newElement.data = data;
                        newElement.nodeNumber = firstElement ? 0 : pointerBefore.nodeNumber + 1;
                        elementWasAdded = true;
                    }
                    pointer.nodeNumber = elementWasAdded ? pointer.nodeNumber + 1 : pointer.nodeNumber;
                    pointerBefore = pointer;
                    pointer = pointer.nextReference;
                    i++;
                } while (pointer != null);
            if (index == i) {
                add(data);
            }
    }
    public void remowe(int index) throws IndexOutOfBoundsException {
        boolean isNotIndex = isNotIndex = (size() < index + 1) || (index < 0);
            if (isNotIndex) {
                throw new IndexOutOfBoundsException(index + " No index");
            }
        Node pointer = this.list;
        Node pointerBefore = new Node();
        boolean isFirstElementDeleted = index == 0;
        boolean isLastElementDeleted;
        boolean elementWasRemoved = false;
        int i = 0;
            do {
                isLastElementDeleted = pointer.nextReference == null;
                if (isFirstElementDeleted & i == 0) {
                    this.list = this.list.nextReference;
                    pointer = this.list;
                    pointer.beforeReference = null;
                } else if (i == index) {
                    if (isLastElementDeleted) {
                        pointerBefore.nextReference = null;
                    } else {
                        pointerBefore.nextReference = pointer.nextReference;
                        pointer.nextReference.beforeReference = pointerBefore;
                        elementWasRemoved = true;
                    }
                }
                pointer.nodeNumber = elementWasRemoved ? pointer.nodeNumber - 1 : i;
                pointerBefore = pointer;
                pointer = pointer.nextReference;
                i++;
            } while (pointer != null);

    }
    public int size() {
        int size = 1;
        Node pointer = this.list.nextReference;
            do {

                pointer = pointer.nextReference;
                size++;
            } while (pointer != null);
        return size;
    }
}




