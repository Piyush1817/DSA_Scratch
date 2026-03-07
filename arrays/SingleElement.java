    package arrays;

    public class SingleElement {
        public static void main(String[] args) {
            int[] arr = {2,2,1};
            int singleElement = findSingleElement(arr);
            System.out.println("The single element in the array is: " + singleElement);
        }

        public static int findSingleElement(int[] arr) {
            int result = 0;
            for (int num : arr) {
                result ^= num; // XOR operation
            }
            return result;
        }
       
     
    }