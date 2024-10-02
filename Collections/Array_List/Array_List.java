import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<String> std = new ArrayList<>();

        std.add("Dhiraj");
        std.add("Patil");
        std.add("Kolhapur");
        std.add("SUK");
        std.add("SUKk");
        std.add(3, "DOT");

        ArrayList<String> deg = new ArrayList<>();
        deg.add("NCK");

        // Add All Array in aother Array
        std.addAll(deg);

        // std.remove(5);
        std.remove(String.valueOf("SUKk")); // Remove as a Name
        std.set(4, "University"); // Update Value
        // std.clear(); //All clear List
        
        System.out.println(std);
        System.out.println(std.get(0) + " from " + std.get(2));
        System.out.println(std.contains("Dhiraj"));   //Check Value in Array it present or not

        for(String e :std){
            System.out.println("Element is : " + e);
            
        }
        
    }
}