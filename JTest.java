public class JTest {
    public static void main(String[] args) {
        try {
            Queue<String> q1 = new QueueLink<>();
            q1.enqueue("A");
            q1.enqueue("B");
            q1.enqueue("C");
            System.out.println("Cola: " + q1);
            System.out.println("Front: " + q1.front());
            System.out.println("Back: " + q1.back());
            System.out.println("Dequeue: " + q1.dequeue());
            System.out.println("Cola después de dequeue: " + q1);

            Queue<Integer> q2 = new QueueLink<>();
            for (int i = 1; i <= 5; i++)
                q2.enqueue(i);
            System.out.println("Cola de enteros: " + q2);
        } catch (ExceptionIsEmpty e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}