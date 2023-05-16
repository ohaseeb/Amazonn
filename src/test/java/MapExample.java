import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class MapExample {

    public static void main(String[] args) {
        Map <Integer,String> map=new HashMap<>();
        map.put(1001,"osama");
        map.put(1002,"haseeb");
        map.put(1003,"samia");
        map.put(1004,"aarifa");
        //System.out.println(map);
         Set<Integer> keys=map.keySet();
        for (Integer key : keys) {
            System.out.println(key);
        }
        Set <Map.Entry<Integer,String>> count=map.entrySet();
        for (Map.Entry<Integer,String> counts:count) {
             Integer k=counts.getKey();
            String l=counts.getValue();
            System.out.println(k);
            System.out.println(l);

        }
    }
}
