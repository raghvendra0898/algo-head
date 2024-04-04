class Deque{
    int []arr;
    int front, size, cap;
    Deque(int c)
    {
        arr = new int[c];
        front = 0;
        cap = c;
        size = 0;
    }
    void deleteFront()
    {
        if(isEmpty())
            return;
        front = (front+1)%cap;
    }
    void deleteRear()
    {
        if(isEmpty())
            return;
        size--;
    }
    void insertRear(int x)
    {
        if(isFull())
            return;
        int new_rear = (front+size)%cap;
        arr[new_rear] = x;
        size++;
    }
    void insertFront(int x)
    {
        if(isFull())
            return;
        front =(front+cap-1)%cap;
        arr[front] = x;
        size++;
    }
    int getFront()
    {
        if(isEmpty())
            return -1;
        else
            return front;
    }
    int getRear()
    {
        if(isEmpty())
            return -1;
        else
            return (front+size-1)%cap;
    }
    boolean isFull()
    {
        return size==cap;
    }
    boolean isEmpty()
    {
        return size==0;
    }
}

public class dequeusingarray {
    public static void main(String[] args) {
        Deque dq = new Deque(6);
        dq.insertFront(25);
        dq.insertRear(32);
        dq.insertRear(56);
        System.out.println(dq.getRear());
        System.out.println(dq.getFront());
        dq.deleteRear();
        System.out.println(dq.getRear());
    }
}
