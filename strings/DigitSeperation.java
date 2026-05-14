package strings ;
import java.util.*;
public class DigitSeperation{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ofelements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements in array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        DigitSeperation ds = new DigitSeperation();
        int[] result = ds.separateDigits(arr);
        System.out.println("Separated digits:");
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
     public int[] separateDigits(int[] nums) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int num : nums) {

            ArrayList<Integer> temp = new ArrayList<>();

            while (num > 0) {
                temp.add(num % 10);
                num /= 10;
            }

            // reverse order while adding
            for (int i = temp.size() - 1; i >= 0; i--) {
                ans.add(temp.get(i));
            }
        }

        int[] result = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}