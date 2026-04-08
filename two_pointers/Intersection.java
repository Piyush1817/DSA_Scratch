//intersection of two linked list ,idea is travel full list then swap the list and travel again if they intersect they will meet at the intersection point otherwise they will meet at null

package two_pointers;

import java.util.*;

public class Intersection {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of List A:");
        int n = sc.nextInt();

        System.out.println("Enter elements of List A:");
        ListNode headA = null, tailA = null;

        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            ListNode newNode = new ListNode(x);

            if(headA == null){
                headA = newNode;
                tailA = newNode;
            }else{
                tailA.next = newNode;
                tailA = newNode;
            }
        }

        System.out.println("Enter size of List B:");
        int m = sc.nextInt();

        System.out.println("Enter elements of List B:");
        ListNode headB = null, tailB = null;

        for(int i=0;i<m;i++){
            int x = sc.nextInt();
            ListNode newNode = new ListNode(x);

            if(headB == null){
                headB = newNode;
                tailB = newNode;
            }else{
                tailB.next = newNode;
                tailB = newNode;
            }
        }

        ListNode intersection = getIntersectionNode(headA, headB);

        if(intersection == null){
            System.out.println("No intersection");
        }else{
            System.out.println("Intersection at node value: " + intersection.val);
        }
    }

    static ListNode getIntersectionNode(ListNode headA, ListNode headB){

        ListNode pA = headA;
        ListNode pB = headB;

        while(pA != pB){

            if(pA == null)
                pA = headB;
            else
                pA = pA.next;

            if(pB == null)
                pB = headA;
            else
                pB = pB.next;
        }

        return pA;
    }
}
