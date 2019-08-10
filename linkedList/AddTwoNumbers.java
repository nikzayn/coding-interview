import java.util.*;
import java.util.LinkedList;


class AddTwoNumbers{
    class Node{
        int data;
        Node next;
    }

    static int reverseNumbers(ListNode l1, ListNode l2){
        ListNode head = new ListNode(0);
        ListNode p = l1; 
        ListNode q = l2; 
        ListNode current = head;
        int carry = 0;

        while(p != null || q != null){
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;

            current = current.next;
            current.next = ListNode(sum % 10);

            if(p != null){
                p = p.next;
            }
            if(q != null){
                q = q.next;
            }
        }

        if(carry > 0){
            current.next = new ListNode(carry);
        }
        return head;
    }
}