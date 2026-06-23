// Given an array of characters chars, compress it using the following algorithm:

// Begin with an empty string s. For each group of consecutive repeating characters in chars:

// If the group's length is 1, append the character to s.
// Otherwise, append the character followed by the group's length.
// The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

// After you are done modifying the input array, return the new length of the array.

// You must write an algorithm that uses only constant extra space.

// Note: The characters in the array beyond the returned length do not matter and should be ignored.

 

// Example 1:

// Input: chars = ["a","a","b","b","c","c","c"]
// Output: 6
// Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
// After modifying the input array in-place, the first 6 characters of chars should be ["a","2","b","2","c","3"].

package twoPointers;

import java.util.Scanner;

public class StringComparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        char[] chars = new char[n];

        System.out.println("Enter the characters:");

        for (int i = 0; i < n; i++) {
            chars[i] = sc.next().charAt(0);
        }

        int length = compress(chars);

        System.out.println("\nCompressed Array:");

        for (int i = 0; i < length; i++) {
            System.out.print(chars[i] + " ");
        }

        System.out.println("\nNew Length = " + length);

        sc.close();
    }

    public static int compress(char[] chars) {

        int i = 0;
        int write = 0;

        while (i < chars.length) {

            char current = chars[i];
            int j = i;

            // Count same consecutive characters
            while (j < chars.length && chars[j] == current) {
                j++;
            }

            int count = j - i;

            // Write the character
            chars[write++] = current;

            // Write count if greater than 1
            if (count > 1) {

                String str = String.valueOf(count);

                for (char c : str.toCharArray()) {
                    chars[write++] = c;
                }
            }

            i = j;
        }

        return write;
    }
}


