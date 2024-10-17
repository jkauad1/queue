package main;

import classes.Queue;

import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) throws Exception {


        //here we create a new Queue object.
        Queue queue = new Queue(5);

        //queue.display(); since our queue is empty, this will give the user a new Exception message

        // here we are inserting new data in the queue
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);

        queue.display();

        queue.enqueue(25);

        System.out.println("After 1 node insertion");
        queue.display();

        System.out.println("Before 3 node deletions");
        queue.display();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println("After 3 node deletions");
        queue.display();

        queue.enqueue(30);
        queue.enqueue(35);

        System.out.println("After 2 insertions");

        queue.display();

    }
}
