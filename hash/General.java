package hash;
import java.util.*;
public class General {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 1);                
        map.put("banana", 2);
        map.put("orange", 3);
        System.out.println("Value for key 'apple': " + map.get("apple"));
        System.out.println("hashMap: " + map);

             HashSet<Integer> set =new HashSet<>();
        set.add(1);
        set.add(2); 
        set.add(3);
        set.add(2);//it will not print because set doesn't allow duplicate values
        System.out.println("Set: " + set);


        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("apple", 1);
        treeMap.put("banana", 2);
        treeMap.put("orange", 3);
        System.out.println("TreeMap: " + treeMap);

   
    }
}
