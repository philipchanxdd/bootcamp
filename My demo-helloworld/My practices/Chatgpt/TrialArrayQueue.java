public class TrialArrayQueue {
  
  public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        
        enqueueElements(queue); // Enqueue elements into the queue
        
        dequeueAndPrintElements(queue); // Dequeue and print elements from the queue
    }
    
    public static void enqueueElements(ArrayQueue queue) {
        System.out.println("Enqueuing elements...");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
    }
    
    public static void dequeueAndPrintElements(ArrayQueue queue) {
        System.out.println("Dequeuing and printing elements...");
        while (!queue.isEmpty()) {
            int item = queue.dequeue();
            System.out.println(item);
        }
    }
}
}
