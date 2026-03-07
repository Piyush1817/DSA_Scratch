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
        set.add(89);
        set.add(3); 
        set.add(2);
        set.add(2);//it will not print because set doesn't allow duplicate values
        System.out.println("Set: " + set);


        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("apple", 1);
        treeMap.put("banana", 2);
        treeMap.put("orange", 3);
        System.out.println("TreeMap: " + treeMap);

        // TreeMap will store the elements in sorted order

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
        System.out.println("TreeSet: " + treeSet);
        // TreeSet will store the elements in sorted order  

   //hashset is aslo store the elements in sorted order but it is not guaranteed that it will always store the elements in sorted order because it uses hashcode to store the elements and hashcode can be same for different elements so it may not store the elements in sorted order but treemap and treeset will always store the elements in sorted order because they use compareTo method to store the elements and compareTo method will always return a negative number if the first element is less than the second element and it will return a positive number if the first element is greater than the second element and it will return 0 if both the elements are equal so it will always store the elements in sorted order
    }
}
