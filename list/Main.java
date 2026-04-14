package list;

import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Main {

    // Method to delete duplicates from sorted linked list
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next; // remove duplicate
            } else {
                curr = curr.next; // move forward
            }
        }
        return head;
    }

    // Helper method to print linked list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("List is empty");
            return;
        }

        // Take input elements (sorted)
        System.out.println("Enter elements (sorted): ");

        int val = sc.nextInt();
        ListNode head = new ListNode(val);
        ListNode curr = head;

        for (int i = 1; i < n; i++) {
            val = sc.nextInt();
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        // Call function
        head = deleteDuplicates(head);

        // Print result
        System.out.print("Output: ");
        printList(head);

        sc.close();
    }
}