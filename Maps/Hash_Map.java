import java.util.HashMap;
import java.util.Map;
// Unique Value , and add duplicate value then update the privious value

public class Hash_Map {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 33);
        map.put("Three", 3);

        // It Checks object are present or not

        // 1) if(!map.containsKey("Two")){
        // map.put("Tow",23);
        // }

        // 2) map.putIfAbsent("Two", 23);

        System.out.println(map);
        System.out.println(map.get("One"));
        System.out.println(map.containsKey("Two"));
        System.out.println(map.containsValue(2));
        System.out.println(map.isEmpty());
        map.clear();
        System.out.println(map);
        
        
        
        

        //Itrator
        //  1) for(Map.Entry<String,Integer>e:    map.entrySet()){
        //     System.out.println(e);
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());
        //  }
     
    //  2) for(Integer value: map.values()){
    //     System.out.println(value);
        
    //  }  
    //  for(String key: map.keySet()){
    //     System.out.println(key);
        
    //  }  
    }
}