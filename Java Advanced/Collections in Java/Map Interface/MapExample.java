import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("first",1);
        map.put("second",2);
        map.put("third",3);

        System.out.println("Map:"+map);

        map.replace("second",4);
        System.out.println("After Replacing:"+map);

        int value = map.remove("first");
        System.out.println("The removed value is:"+value);
        
    }
}
