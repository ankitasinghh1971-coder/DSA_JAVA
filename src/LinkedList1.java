import java.util.LinkedList;
public class LinkedList1 {




        public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<>();


            list.add("Apple");
            list.addFirst("Banana");
            list.addLast("Cherry");
            list.add(1, "Date");


            System.out.println("LinkedList: " + list);
       System.out.println("First Element: " + list.getFirst());
            System.out.println("Last Element: " + list.getLast());

            list.remove("Apple");
            list.removeFirst();
            list.removeLast();

            System.out.println("After Removal: " + list);

            System.out.println("Traversing:");
            for (String item : list) {
                System.out.println(item);
            }
        }
}


