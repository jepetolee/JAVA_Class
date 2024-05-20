package April26th;
import java.lang.ArrayIndexOutOfBoundsException;

interface Queue{
    void enqueue(Object data);
    Object dequeue();
    boolean isFull();
}

public class MyQueue implements Queue{
    Object[] queue;
    int front=0,rear =0,length;

    public MyQueue(int length){
        this.length=length;
        queue = new Object[length];
    }
    public void enqueue(Object data){
        if (isFull()){
            System.out.println("Overed Allocation");
            throw new ArrayIndexOutOfBoundsException();

        }
        queue[rear++] = data;
        rear=rear%queue.length;
    }
    public Object dequeue(){
        if (isFull()){
            System.out.println("Overed Allocation");
            throw new ArrayIndexOutOfBoundsException();
        }

        Object dequeuedData = queue[front];
        queue[front++] = null;
        front = front % queue.length;

        return dequeuedData;
    }
    public boolean isFull(){
        return front == rear&& queue[front]!=null;
    }

}
