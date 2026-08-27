//Circular queue
public class Main {
    protected int[] data;

    private static final int DEFAULT_SIZE = 10;
    protected int end =0;
    protected int front = 0;
    private int size = 0;
    public Main(){
        this(DEFAULT_SIZE);
    }
    public Main(int size){
        this.data = new int[size];
    }
    public boolean isFull(){
        return size == data.length;
    }
    public boolean isEmpty(){
       return size ==0;
    }
    public boolean insert(int item){
        if(isFull()){
            return  false;

        }
        data[end++] = item;
        end = end% data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int remove = data[front++];
        front = front % data.length;
        size--;
        return remove;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[front];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
       int i = front;
       do{
           System.out.printf(data[i] + "-->");
           i++;
           i%= data.length;
       }while (i != end);
        System.out.println("End");
    }

    public static void main(String[] args) throws Exception {
        Main queue = new Main(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(12);
        queue.insert(44);

        queue.display();
        System.out.println(String.valueOf(queue.remove()));
queue.insert(133);
        queue.display();
    }
}