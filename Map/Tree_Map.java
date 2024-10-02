// package Map;
import java.util.TreeMap;
import java.util.Map;

public class Tree_Map {
    public static void main(String[] args) {

        Map<Integer, String> tm = new TreeMap<>();

        tm.put(1, "One");
        tm.put(2, "Two");
        tm.put(3, "Three");
        tm.put(4, "Four");

        System.out.println(tm);
        tm.remove(4);
        System.out.println(tm);

    }
}
