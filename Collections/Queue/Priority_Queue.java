import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority_Queue {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(10);
        pq.offer(20);
        pq.offer(40);
        pq.offer(30);

        System.out.println(pq);
        System.out.println(pq.peek());
        pq.poll();
        System.err.println(pq);
        System.out.println(pq.peek());
        
        
    }
}
