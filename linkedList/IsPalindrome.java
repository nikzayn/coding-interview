import java.util.*;

class IsPalindrome{
    class Node{
        Node next;
        int data;
        Node(int d){
            data = d;
            next = null;
        }
    }
        //Approach - 1 Use a stack
        //Time Complexity: O(n)
        static boolean IsPalin(Node head){
            Node slow = head;
            boolean isPalindrome = false;

            //Traverse the nodes into the stack
            Stack<Integer> stack = new Stack<Integer>();
                while(slow != head){
                    stack.push(slow.data);
                    slow = slow.next;
                }
            //Traverse the nodes and pop the stack and compare the popped stack and currently exisiting stack
                while(head != null){
                    int popped = stack.pop();
                    if(head.data == popped){
                        isPalindrome = true;
                    } 
                    else{
                        isPalindrome = false;
                        break;
                    }
                    head = head.next;      
                }
                return isPalindrome;
        }
    }