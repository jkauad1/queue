package classes;

public class Queue {

    int front, rear, capacity;
    int[] queue;

    public Queue(int capacity){
        this.front = 0;
        this.rear = -1;
        this.capacity = capacity;
        queue = new int[capacity];
    }

    public void enqueue(int data) throws Exception{
        if (rear == capacity - 1) {
            throw new Exception("The queue is full.");
        }

        queue[++rear] = data;
    }

    public void dequeue() throws Exception {

        if (front > rear) {
            throw new Exception("The queue is empty.");
        }

        //Shift all elements from the queue to the left
        for (int i = 0; i < rear; i++){
            queue[i] = queue[i + 1];
        }

        rear--;
    }

    public void display() throws Exception {

        if (front > rear) throw new Exception("Queue is empty.");

        for (int i = front; i <= rear; i++){
            System.out.print(queue[i] + " <-- ");
        }
        System.out.println();
    }

    public void front() throws Exception{

        if (rear == -1) throw new Exception("Queue is empty.");

        System.out.println("Front element is: " + queue[front]);
    }
}
