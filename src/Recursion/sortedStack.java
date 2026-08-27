package Recursion;
import java.util.Stack;
import java.util.*;

public class sortedStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        System.out.println("Original stack: " + stack);
        sortStack(stack);
        System.out.println("Sorted stack: " + stack);
    }
    static void sortStack(Stack<Integer> s){
        Stack<Integer> tempStack = new Stack<>();
        while(!s.isEmpty()){
            int temp = s.pop();
            while(!tempStack.empty() && temp < tempStack.peek()){
                s.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        while (!tempStack.isEmpty()) {
            s.push(tempStack.pop());
        }

    }
}
