import java.util.HashSet;
import java.util.Set;

public class HashSet_{

    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(41);
        set.add(40);        //Hasset Dosent Allow to Duplicate Value

        set.remove(6);
        System.out.println(set);
        System.out.println(set.contains(41));
        System.out.println(set.isEmpty());

        set.clear();
        System.out.println(set);
        
        

        
    }
}