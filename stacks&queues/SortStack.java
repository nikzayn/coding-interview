
import java.util.Stack; 

class SortStack{

    static void sortStack(Stack<Integer> stack){
        //If stack is not empty
        if(!stack.isEmpty()){
            int temp = stack.pop();
 
            //Remaining stack
            sortStack(stack);
 
            //Push back the top item in sortedStack
            sortedStack(stack, temp);
 
        }
    }

   static void sortedStack(Stack<Integer> stack, int item){
        //Is stack is empty or newly created item is greater than top of the stack
        if(stack.isEmpty() || item > stack.peek()){
            //Pushing the item in the stack
            stack.push(item);
            return;
        }

        //If top is greater than the item then remove the top item and recur
        int temp = stack.pop();
        sortedStack(stack, item);

        //Put back the top item removed
        stack.push(temp);
   }

   static void printStack(Stack<Integer> stack){
       
   }

   public static void main(String[] args){
       Stack<Integer> stack = new Stack<>();
       stack.push(30); 
       stack.push(-5); 
       stack.push(18); 
       stack.push(14); 
       stack.push(-3);

       System.out.println("After sorted");
       sortStack(stack);
   }
   
}