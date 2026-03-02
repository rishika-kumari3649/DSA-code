import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);

        if(map.containsKey("China")){
            System.out.println("Key present in Map");
        }else {
            System.out.println("key not present");
        }

        System.out.println(map.get("China"));
        System.out.println(map.get("Nepal"));

        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }



    }
}