import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        System.out.println("Queue: " + queue); // [Alice, Bob, Charlie]

        String frontElement = queue.peek();
        System.out.println("Front element: " + frontElement); // Alice

        String removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement); // Alice
        System.out.println("Updated Queue: " + queue); // [Bob, Charlie]

        boolean isEmpty = queue.isEmpty();
        System.out.println("Is Queue empty? " + isEmpty); // false

        int size = queue.size();
        System.out.println("Size of Queue: " + size); // 2
    }
}
