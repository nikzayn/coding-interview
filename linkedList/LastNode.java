import java.util.*;


class LastNode{
    Node head;

    class Node{
        Node next;
        int data;
        Node(int d){
            data = d;
            next = null;
        }
    }

    //Approach - 1 -> Use length of linked list

    //Time Complexity -> O(n)
    //Space Complexity -> O(n)
    
    //(a.) -> Count the length of linked list
    //(b.) -> Print the (len - n + 1) the node from beginning of the linked list

     void printkthLastNode(int n){
        int count = 0;

        Node temp = head;
       
        //Count number of nodes
        while(temp != null){
            temp = temp.next;
            count++;
        }

        //Check if length of the nodes is more than number of nodes
        if(count < n){
            return;
            temp = head;
        }

        //Print the length thr node from beginning of the linked list
        for(int i = 1; i < count - n + 1); i++){
            temp = temp.next;
            System.out.println(temp.data);
        }   
    }


    //Approach - 2 -> Using two pointers
    //Time Complexity -> O(n)
    //Space Complexity -> O(1)

    void printkthLastNodeUsingPointers(int n){
        Node mainPointer = head;
        Node referencePointer = head;

       //Move reference pointers to n nodes from head.
        int count = 0;
        if(head != null){
            while(count < n){
                if(referencePointer == null){
                    System.out.println(n + "is greater than number of nodes in the list.");

                    return;
                }
                referencePointer = referencePointer.next;
                count++;
            }
        }

        //Now the main pointer will point to the nth node from end.
        while(referencePointer != null){
            mainPointer = mainPointer.next;
            referencePointer = referencePointer.next;
        }

        System.out.println("Node no " + n + "from the last node is " + mainPointer.data);

    }

}