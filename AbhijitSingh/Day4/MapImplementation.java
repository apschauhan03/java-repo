import java.util.HashMap;
import java.util.Map;

public class MapImplementation {
    public static void main(String[] args) { 
        Map<Integer, String> mp = new HashMap<>();

        mp.put(1, "a");
        mp.put(2, "b");
        mp.put(3, "c");
        mp.put(4, "c");
        mp.remove(3);
        
        
        if (mp.containsValue("d"))
            System.out.println(mp.keySet());
        
        System.out.println(mp.entrySet());

    }
}
