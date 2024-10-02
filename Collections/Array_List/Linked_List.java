import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(300);
        ll.add(40);
        ll.add(400);

        System.out.println(ll);
        ll.remove(3);
        ll.remove(4);
        System.out.println(ll);
        System.out.println(ll.get(2));
        
    }
}
