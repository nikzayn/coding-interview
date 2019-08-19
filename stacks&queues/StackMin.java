import java.util.*;


class StackMin{
   Stack<Integer> s;
   Integer min;

    public StackMin(){
        s = new Stack<Integer>();
    }

    //Return the minimum value from the stack
    public void min(){
        if(s.isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Minumum element in stack: " + min);
        }
    }

    //Return the top most value from the stack
    public void peek(){
        if(s.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        Integer peek = s.peek();
        System.out.println("Top most value of the stack");

        //Check if the peek is less than minimum value
        if(peek < min){
            System.out.println(min);
        } else{
            System.out.println(peek);
        }
    }

    //Return the pop value from the stack
    public void pop(){
        if(s.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }

        Integer pop = s.pop();
        System.out.println("Top most stack value popped");

        //Check if the pop is less than minimum value
        if(pop < min){
            System.out.println(min);
            min = 2*min - pop;
        }
        else{
            System.out.println(pop);
        }
    }

    //Return the pushed value from the stack
    public void push(int item){
        if(s.isEmpty()){
            min = item;
            s.push(item);
            System.out.println("Number inserted: " + item);
            return;
        }

        //Check if the push is less than minimum value
        if(item < min){
            s.push(2*item - min);
            min = item;
        }
        else{
            s.push(item);
        }
        System.out.println("Number inserted: " + item);
    }



    public static void main(String[] args){
        StackMin s = new StackMin();
        s.push(1); 
        s.push(5); 
        s.min(); 
        s.push(2); 
        s.push(3); 
        s.min(); 
        s.pop(); 
        s.min(); 
        s.pop(); 
        s.peek();
    }

}
