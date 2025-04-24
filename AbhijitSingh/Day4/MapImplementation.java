import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapImplementation {
    public static void main(String[] args) { 
        Map<String, ArrayList<Integer>> mp = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        mp.put("a", arr);
        mp.put("b", arr);
        mp.put("c", arr);
        mp.put("d", arr);
        mp.remove("a");
        
        
        if (mp.containsValue(arr))
            System.out.println(mp.keySet());
        
        System.out.println(mp.entrySet());


        ArrayList<Integer> temp = mp.get("b");

        temp.add(7);

        if(temp.contains(1))
            System.out.println("Contains 1");

        for (Integer integer : temp) {
            System.out.println(integer);
        }

    }
}
