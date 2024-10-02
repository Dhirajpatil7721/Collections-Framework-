import java.util.Set;
import java.util.TreeSet;

// COmes in Sorted Form

public class Tree_Hash_Set {
 public static void main(String[] args) {
    Set<Integer> tree=new TreeSet<>();

    tree.add(10);
    tree.add(30);
    tree.add(90);
    tree.add(20);
    tree.add(40);
    tree.add(70);
    tree.add(50);
    tree.add(60);
    tree.add(80);
    tree.add(820);

    tree.remove(820);
    System.out.println(tree);
    
 }   
}
