// There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

// You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.

 

// Example 1:

// Input: gain = [-5,1,5,0,-7]
// Output: 1
// Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

package arrays;
import java.util.*;

public class MaxAltitude{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of gain array or number of altitude points gain ");
        int n= sc.nextInt();
         int[] gain = new int[n];
        System.out.println("gain at every point ");
        for(int i = 0 ;i<n;i++){
            gain[i]=sc.nextInt();
        }
       int maxPoint = largestAltitude( gain);
     System.out.println("Maximum Altitude = " + maxPoint);

       int maxPoint2 = largestAltitude2( gain);
     System.out.println("Maximum Altitude = " + maxPoint2);

    }

    public static int largestAltitude(int[] gain) {
        
        int[] altitude = new int[gain.length + 1];
        altitude[0] = 0;

        int maxAltitude = altitude[0];

        for (int i = 1; i <= gain.length; i++) {
            altitude[i] = altitude[i - 1] + gain[i - 1];

            if (altitude[i] > maxAltitude) {
                maxAltitude = altitude[i];
            }
        }

        return maxAltitude;
}

// without extra space 
  public static int largestAltitude2(int[] gain) {
        
      int currentAltitude = 0;
        int maxAltitude = 0;

        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }

        return maxAltitude;
    }
}