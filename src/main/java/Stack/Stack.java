package Stack;

import java.util.Arrays;

public class Stack {
    private int top;
    private int[] stackArray;

    public Stack(int maxSize){
        top = -1;
        stackArray = new int[maxSize];
        }

    public void push(int i){
        top++;
        stackArray[top] = i;
    }

    public int pop(){
        int toReturn = stackArray[top];
        top--;
        return toReturn;
    }

    public static void main(String[] args) {
        Stack myStack = new Stack(5);
        System.out.println(Arrays.toString(myStack.stackArray));
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.pop();
        myStack.push(10);
        System.out.println(Arrays.toString(myStack.stackArray));
    }
}
