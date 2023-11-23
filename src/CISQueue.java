import java.util.Arrays;

public class CISQueue {
    private Integer[] queue;
    private int size;
    private int front;
    private int rear;

    public CISQueue(int capacity) {
        queue = new Integer[capacity];
        size = 0;
        front = 0;
        rear = -1;
    }

    public void enqueue(Integer data) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = data;
        size++;
    }

    public Integer dequeue() {
        if (isEmpty()) {
            return null;
        }
        Integer data = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "CISQueue{" +
                "queue=" + Arrays.toString(queue) +
                ", size=" + size +
                ", front=" + front +
                ", rear=" + rear +
                '}';
    }
}