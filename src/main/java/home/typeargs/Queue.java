package home.typeargs;

public class Queue<E> {

    private E[] elements;

    private int head = 0 , tail = 0;

    public Queue(int size) {
        elements = (E[]) new Object[size];
    }

    void insert(E element) throws QueueFullException{
        if(isFull()){
            throw new QueueFullException();
        }
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
    }

    E remove() throws QueueEmptyException{
        if (isEmpty()){
            throw new QueueEmptyException();
        }
        E element = elements[head];
        head = (head + 1) % elements.length;
        return element;
    }

    boolean isFull(){
        return (tail + 1) % elements.length == head;
    }

    boolean isEmpty(){
        return head == tail;
    }
}
