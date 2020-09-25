package queue;

public class CircularQueue {
    private int head;//头指针
    private int tail;//尾指针
    private String[] items;
    private int count;//队列里面的元素个数
    private int n;//队列容量


    public CircularQueue(int capacity){
        this.items=new String[capacity];
        this.n=capacity;
    }

    public boolean enqueue(String item)
    {
        if ((tail+1)%n==head)
            return false;
        items[tail]=item;
        tail=(tail+1)%n;
        return true;
    }

    public String dequeue(){
        if (head==tail)
            return null;
        String item=items[head];
        head=(head+1)%n;
        return item;
    }
}
