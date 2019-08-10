import java.util.*;

class Partition{
    static class Node{
        Node next;
        int data;
    }

    static Node newNode(int data){
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = null;
        return new_node;
    }

    static Node partitionize(Node head, int x){

        //Creating the listnode of values
        Node smallerHead = null;
        Node smallerLast = null;

        Node equalHead = null;
        Node equalLast = null;

        Node greaterHead = null;
        Node greaterLast = null;

        //Iterating through the number of nodes
        while(head != null){
            //Check if the number of nodes is equal to the partition value
            if(head.data == x){
                if(equalHead == null){
                    equalLast = equalHead = head;
                }
                else{
                    equalLast.next = head;
                    equalLast = equalLast.next;
                }
            }

            //Check if the number of nodes is less than the partiton value
            else if(head.data < x){
                if(smallerHead == null){
                    smallerLast = smallerHead = head;
                }
                else{
                    smallerLast.next = head;
                    smallerHead = head;
                }
            }
            //Check if the number of nodes is more than the partition value
            else{
                if(greaterHead == null){
                    greaterLast = greaterHead = head;
                }
                else{
                    greaterLast.next = head;
                    greaterHead = head;
                }
            }
            head = head.next;
        }

        if(greaterLast != null){
            greaterLast.next = null;
        }

        //Connect three lists
        //If smaller list is empty
        if(smallerHead == null){
            if(equalHead == null){
                return greaterHead;
            }
            equalLast.next = greaterHead;
            return greaterHead;
        }

        //If small is not empty but equal is empty
        if(equalHead == null){  
            smallerLast.next = greaterHead;
            return smallerHead;
        }

        //If both are empty equal and small
        smallerLast.next = equalHead;
        equalLast.next = greaterHead;
        return smallerHead;
    }

    static void printList(Node head){
        Node temp = head;
        
        while(temp != null){
            System.out.println(temp.data + " "); 
            temp = temp.next;
        }
    }

    public static void main(String[] args){
        Node head = newNode(10);
        head.next = newNode(4);  
        head.next.next = newNode(5);  
        head.next.next.next = newNode(30);  
        head.next.next.next.next = newNode(2);  
        head.next.next.next.next.next = newNode(50);

        int x = 3;
        head = partitionize(head, x);  
        printList(head);  
    }
}