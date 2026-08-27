import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuildExamples {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(34);
//        stack.push(11);
//        stack.push(3);
//        stack.push(23);
//        stack.push(56);




       // System.out.println(stack.pop());
       // System.out.println(stack.pop());
       // System.out.println(stack.pop());
       // System.out.println(stack.pop());
       // System.out.println(stack.pop());
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(51);
        queue.add(4);
        queue.add(16);
        queue.add(7);
        System.out.println(queue.remove());


    }
}
