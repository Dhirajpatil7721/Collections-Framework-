import java.util.ArrayDeque;

public class Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> arr = new ArrayDeque<>();

        arr.offer(10);
        arr.offerFirst(20);
        arr.offerLast(30);
        arr.offer(40);
        arr.offer(50);

        System.out.println(arr);

        System.out.println("peek " + arr.peek());
        System.out.println("peek First " + arr.peekFirst());
        System.out.println("peek Last " + arr.peekLast());

        arr.poll();
        arr.pollFirst();
        arr.pollLast();
        System.out.println(arr);

    }
}