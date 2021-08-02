package part2;

public class ALinkedList<E> {


    private static int counter;
    private Node<E> head;

    private static int getCounter() {
        return counter;
    }

    private static void incrementCounter() {
        counter++;
    }

    private void decrementCounter() {
        counter--;
    }

    // Default constructor
    public ALinkedList() {

    }

    // appends the specified element to the end of this list.
    public void add(E data) {
        // Initialize Node only incase of 1st element
        if (head == null) {
            head = new Node<>(data);
        }

        Node<E> nodeTemp = new Node<>(data);
        Node<E> nodeCurrent = head;

        // Let's check for NPE before iterate over crunchifyCurrent
        if (nodeCurrent != null) {

            // starting at the head node, crawl to the end of the list and then add element after last node
            while (nodeCurrent.getNext() != null) {
                nodeCurrent = nodeCurrent.getNext();
            }

            // the last node's "next" reference set to our new node
            nodeCurrent.setNext(nodeTemp);
        }

        // increment the number of elements variable
        incrementCounter();
    }


    // inserts the specified element at the specified position in this list
    public void add(E data, int index) {
        Node<E> nodeTemp = new Node<>(data);
        Node<E> nodeCurrent = head;

        // Let's check for NPE before iterate over crunchifyCurrent
        if (nodeCurrent != null) {
            // crawl to the requested index or the last element in the list, whichever comes first
            for (int i = 0; i < index && nodeCurrent.getNext() != null; i++) {
                nodeCurrent = nodeCurrent.getNext();
            }
        }

        // set the new node's next-node reference to this node's next-node reference
        nodeCurrent.setNext(nodeCurrent.getNext());

        // now set this node's next-node reference to the new node
        nodeCurrent.setNext(nodeTemp);

        // increment the number of elements variable
        incrementCounter();
    }

    public E get(int index){
    // returns the element at the specified position in this list.
        // index must be 1 or higher
        if (index < 0)
            return null;
        Node<E> nodeCurrent = null;
        if (head != null) {
            nodeCurrent = head.getNext();
            for (int i = 0; i < index; i++) {
                if (nodeCurrent.getNext() == null)
                    return null;

                nodeCurrent = nodeCurrent.getNext();
            }
            return nodeCurrent.getData();
        }
        return (E) nodeCurrent;

    }

    // removes the element at the specified position in this list.
    public boolean remove(int index) {
        // if the index is out of range, exit
        if (index < 1 || index > size())
            return false;
        Node<E> nodeCurrent = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (nodeCurrent.getNext() == null)
                    return false;

                nodeCurrent = nodeCurrent.getNext();
            }
            nodeCurrent.setNext(nodeCurrent.getNext().getNext());

            // decrement the number of elements variable
            decrementCounter();
            return true;
        }
        return false;
    }

    // returns the number of elements in this list.
    public int size() {
        return getCounter();
    }

    public String toString() {
        String output = "";
        if (head != null) {
            Node<E> nodeCurrent = head.getNext();
            while (nodeCurrent != null) {
                output += "[" + nodeCurrent.getData().toString() + "]";
                nodeCurrent = nodeCurrent.getNext();
            }
        }
        return output;
    }
}


