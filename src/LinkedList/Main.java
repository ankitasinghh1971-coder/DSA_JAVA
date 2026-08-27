package LinkedList;

public class Main {
    public static void main(String[] args) {
Singly list = new Singly();
list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(29);
        list.insertFirst(390);
        list.display();
//        list.insertLast(6785);
//        list.display();
//        list.insert(1000,3);
//        list.display();
//        list.deleteFirst();
//        list.display();
//        list.deleteLast();
//        list.display();
//        list.delete(2);
//        list.display();
//            Doubly list = new Doubly();
//            list.insertFirst(4);
//        list.insertFirst(5);
//        list.insertFirst(29);
//        list.insertFirst(390);
//        list.insertLast(234);
//        list.insert(4,44);
//        list.display();

        list.insertRec(88,3);
        list.display();
    }
}
