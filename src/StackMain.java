public class StackMain {
    public static void main(String[] args) throws  StackException {
        CustomStack stack = new CustomStack(5);
        stack.push(34);
        stack.push(11);
        stack.push(3);
        stack.push(23);
        stack.push(56);

        System.out.println(stack.pop());
         System.out.println(stack.pop());
         System.out.println(stack.pop());
         System.out.println(stack.pop());
         System.out.println(stack.pop());
    }
}
