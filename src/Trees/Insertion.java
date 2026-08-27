package Trees;

import java.util.Scanner;

//public class Insertion{
//    public Insertion(){}
//    public static class Node{
//        int value;
//        Node left;
//        Node right;
//        public Node(int value){
//            this.value = value;
//        }
//    }
//    private Node root;
//    public void populate(Scanner scanner){
//        System.out.println("Enter the value of root: ");
//        int value = scanner.nextInt();
//        root = new Node(value);
//        populate(scanner,root);
//    }
//    private void populate(Scanner scanner,Node node){
//        System.out.println("Do you want to enter to the left of "+node.value);
//        boolean left = scanner.nextBoolean();
//        if(left){
//            System.out.println("Enter the value to the left of "+ node.value);
//            int value = scanner.nextInt();
//            node.left = new Node(value);
//            populate(scanner,node.left);
//        }
//        System.out.println("Do you want to enter to the right of "+node.value);
//        boolean right = scanner.nextBoolean();
//        if(right){
//            System.out.println("Enter the value to the right of "+node.value);
//            int value = scanner.nextInt();
//            node.right = new Node(value);
//            populate(scanner,node.right);
//        }
//    }
//    public void preOrder(){
//        preOrder(root);
//    }
//    public void preOrder(Node node){
//        if(node == null)return;
//
//        System.out.print(node.value + " ");
//        preOrder(node.left);
//        preOrder(node.right);
//    }
//    public void display(){
//        display(root,"");
//    }
//    private void display(Node node,String indent){
//        if(node == null)return;
//        System.out.println(indent+node.value);
//        display(node.left,indent+"\t");
//        display(node.right,indent+"\t");
//    }
//
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Insertion tree = new Insertion();
//        tree.populate(scanner);
//        tree.display();
//        tree.preOrder();
//    }

//    public static class Node{
//        int value;
//        Node left;
//        Node right;
//        public Node(int value){
//            this.value = value;
//        }
//    }
//    public Insertion(){}
//    private Node root;
//
//    public void populate(Scanner scanner){
//        System.out.println("Enter the value of root node: ");
//        int value = scanner.nextInt();
//        root = new Node(value);
//        populate(scanner,root);
//    }
//    private void populate(Scanner scanner,Node node){
//        System.out.println("Do you want the enter left of "+ node.value);
//        boolean left = scanner.nextBoolean();
//        if(left){
//            System.out.println("Enter the value left of "+node.value);
//            int value = scanner.nextInt();
//            node.left = new Node(value);
//            populate(scanner,node.left);
//        }
//        System.out.println("Do you want to enter right of "+node.value);
//        boolean right = scanner.nextBoolean();
//        if(right){
//            System.out.println("Enter the value right of "+node.value);
//            int value = scanner.nextInt();
//            node.right = new Node(value);
//            populate(scanner,node.right);
//        }
//    }
//    public void display(){
//        display(root,"");
//    }
//    private void display(Node node,String indent){
//        if(node == null)return;
//
//        System.out.println(indent + node.value);
//        display(node.left,indent+"\t");
//        display(node.right,indent+"\t");
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new
//    }
//}
