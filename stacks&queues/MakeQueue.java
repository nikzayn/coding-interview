import java.util.*;

 class MakeQueue{
    //Created two stacks
     Stack<Integer> s1 = new Stack<>();
     Stack<Integer> s2 = new Stack<>();

    //Approach - 1 "By making enqueue operation"
    //Time Complexity - O(n) for enqueue (O(n) repeated twice)
    //Time Complexity - O(1) fro dequeue

    //Enqueuing the value to the back
      void enqueue(int item){

        //If the s1 stack is not empty, then push the stack 1 to stack 2
        
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

        //Push an item to stack 1
        s1.push(item);

        //Push everything back to stack 1
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    //Dequeuing the value from the front
        int dequeue(){

            //If stack 1 is empty
            if(s1.isEmpty()){
                System.out.println("Queue is empty");
                System.exit(0);
            }

            //Pop an item from stack 1 and return it.
            int top = s1.peek();
            s1.pop();
            return top;
        }
        

        public static void main(String[] args){
            MakeQueue q = new MakeQueue();
             q.enqueue(1);
             q.enqueue(2);
             q.enqueue(3);

             System.out.println(q.dequeue());
             System.out.println(q.dequeue());
             System.out.println(q.dequeue());
        }

}



        //Approach - 2 "By making dequeue operation"
        //Time Complexity - O(n) for dequeue (O(n) only use once)
        //Time Complexity - O(1) for enqueue

    //     class MakeQueue{
    //         //Create Stacks
    //         Stack<Integer> s1;
    //         Stack<Integer> s2;

    //         //Pushing the stacks
    //         void push(Stack<Integer> top, int new_data){
    //             top.push(new_data);
    //         }

    //         void pop(Stack<Integer> top){
    //             //If stack is empty
    //             if(s1.isEmpty()){
    //                 System.out.println("Stack Error");
    //                 System.exit(0);
    //             }

    //             //Pop the value from top stack
    //             top.pop();
    //         }

    //         //Adding the queue to the stack1 and the item
    //         void enQueue(Queue q, int item){
	// 			push(q.s1, item);
    //         }

    //         void deQueue(Queue q){
    //             //If both stacks are empty
    //              if(s1.isEmpty() && s2.isEmpty()){
    //                  if(s2.isEmpty){
    //                      while(!s1.isEmpty()){
    //                          int x = pop(q.s1);
    //                          push(q.s2, x);
    //                      }
    //                  }
    //                  x = pop(q.s2);
    //                  return x;
    //              }
    //         }
    //         public static void main(String args[]) 
    // { 
    //     /* Create a queue with items 1 2 3*/
    //     MakeQueue q = new MakeQueue(); 
    //     q.stack1 = new Stack<>(); 
    //     q.stack2 = new Stack<>(); 
    //     enQueue(q, 1); 
    //     enQueue(q, 2); 
    //     enQueue(q, 3); 
  
    //     /* Dequeue items */
    //     System.out.print(deQueue(q) + " "); 
    //     System.out.print(deQueue(q) + " "); 
    //     System.out.println(deQueue(q) + " "); 
    // } 
    //     }