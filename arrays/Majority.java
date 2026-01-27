package arrays;

 public class Majority {
    public static void main(String[] args ){
        int[] nums = {2,2,1,1,1,2,2};
        int[] count =new int[nums.length];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
       
        int max=0;
        for(int i=0;i<count.length;i++){
            if(count[i]>max){
                max=i;
            }
        }
        System.out.println("Majority element is: " + max);
 }
}
