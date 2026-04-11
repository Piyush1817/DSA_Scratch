package recursion;

import java.util.*;

public class Subsequence2{

    static Map<Integer, List<String>> map = new HashMap<>();

    static void subseq(String str, int i, String curr){

        if(i == str.length()){
            int len = curr.length();
            map.putIfAbsent(len, new ArrayList<>());
            map.get(len).add(curr);
            return;
        }

        // include
        subseq(str, i+1, curr + str.charAt(i));

        // exclude
        subseq(str, i+1, curr);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        subseq(str,0,"");

        for(int key : map.keySet()){
            System.out.println("Length " + key + " → " + map.get(key));
        }
    }
}