import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class JavaBuiltInQueue {
    public static void main(String[] args) {
        // Using LinkedList as a queue
        Queue<String> animalQueue1 = new LinkedList<>();

        // Using ArrayDeque as a queue
        Queue<String> animalQueue2 = new ArrayDeque<>();

        // Using PriorityQueue as a queue
        Queue<String> animalQueue3 = new PriorityQueue<>();

        // Add elements to the queues
        animalQueue1.offer("apple");
        animalQueue1.offer("banana");
        animalQueue1.offer("cherry");

        // Print the contents of the queue
        System.out.println("Queue (LinkedList): " + animalQueue1);

        // Remove an element from the front of the queue
        animalQueue1.poll();
        System.out.println("Queue after poll: " + animalQueue1);
    }
}
