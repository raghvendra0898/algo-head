class Node
{
    int data;
    Node next;
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class Queue{
    Node front, rear;
    int size = 0;
    Queue()
    {
        front = rear = null;
    }

    void enqueue(int x)
    {
        Node temp = new Node(x);
        if(front == null)
        {
            front = rear = temp;
            System.out.println(x+" is enqueued");
            size++;
        }
        else{
            rear.next = temp;
            rear = temp;
            System.out.println(x +" is enqueued");
            size++;
        }
    }

    void dequeue()
    {
        if(front==null)
        {
            System.out.println("No element present");
            size--;
        }
        else
        {
            System.out.println(front.data+" is dequeued");
            size--;
            front = front.next;
            if(front == null)
            {
                rear = null;
                System.out.println("No element present");
            }
        }
    }

}


public class implementQueueusingLinkedList {
    public static void main(String args[])
    {
        Queue temp = new Queue();
        temp.enqueue(5);
        temp.enqueue(8);
        temp.enqueue(9);
        temp.dequeue();
        temp.enqueue(3);
        temp.dequeue();
        temp.enqueue(6);
        temp.dequeue();
    }
    
}
