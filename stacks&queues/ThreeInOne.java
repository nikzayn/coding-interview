import java.util.*;

public class ThreeInOne{

    //Stacks created for operations
    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public ThreeInOne(int stackSize){
        stackCapacity = stackSize;
        values = new int[stackSize * numberOfStacks];
        sizes = new int[numberOfStacks];
    }

    //Push the values in the stack
    public void push(int stackNum, int value) throws FullStackException{
        //Checking if the stack is not full
        if(isFull(stackNum)){
           throw new FullStackException();
        }
        //Else update the top value and increment the stack pointer
        sizes[stackNum]++;
        values[indexOfTop(stackNum)] = value;
    }

    //Pop out the values from the stack
    public int pop(int stackNum){
        //Checking ifthe top values is not empty
        if(isEmpty(stackNum)){
            throw new EmptyStackException();
        }
        //Else pop out the value by following processes

        int topIndex = indexOfTop(stackNum);
        
        //Get Top
        int value = values[topIndex];
        
        //Clearing the top index values
        values[topIndex] = 0;

        //Shrinking the size of the stack
        sizes[stackNum]--;

        return value;
    }

    //Peek out the top values
    public int peek(int stackNum){
        //Checking if empty
        if(isEmpty(stackNum)){
            throw new EmptyStackException();
        }
        return values[indexOfTop(stackNum)];
    }

    //Return if stack is empty
    public boolean isEmpty(int stackNum){
        return sizes[stackNum] == 0;
    }

    //Return if stack is full
    public boolean isFull(int stackNum){
        return sizes[stackNum] == stackCapacity;
    }

    //If index is at the top of the stack
    public int indexOfTop(int stackNum){
        int off = stackNum + stackCapacity;
        int size = sizes[stackNum];
        return off + size - 1;
    }
}

