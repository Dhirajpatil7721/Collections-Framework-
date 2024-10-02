import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_HashSet {
    public static void main(String[] args) {
        Set<Integer> set=new LinkedHashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(440);

        set.remove(440);
        System.out.println(set);
        
    }
}
