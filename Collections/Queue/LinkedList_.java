import java.util.LinkedList;
import java.util.Queue;

public class LinkedList_ {
    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<>();
        list.offer(10);
        list.offer(20);
        list.offer(30);
        list.offer(40);                     //Add

        System.out.println(list);           //Print
        System.out.println(list.peek());   //Peek (See)  
        System.err.println(list.poll());  //Remove
        System.out.println(list);
        System.out.println(list.peek());

    }
}
