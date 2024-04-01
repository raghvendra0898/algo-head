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
class MyStack
{
    Node head;
    int size;
    MyStack()
    {
        head = null;
        size = 0;
    }

    int size()
    {
        return size;
    }

    boolean isEmpty()
    {
        return (head==null);
    }

    void push(int x)
    {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }

    int pop()
    {
        if(head==null)
            return Integer.MAX_VALUE;

        int res = head.data;
        head = head.next;
        size--;
        return res;
    }

    int peek()
    {
        if(head==null)
            return Integer.MAX_VALUE;
        return head.data;
    }
}

public class implementStackusingLinkedList {
    public static void main(String args[])
    {
        MyStack s = new MyStack();
        System.out.println(s.peek());
        s.push(24);
        s.push(29);
        System.out.println(s.pop()+" first popped element");
        s.push(30);
        s.push(36);
        System.out.println((s.size()+" size of the stack"));
        System.out.println(s.pop()+" second element popped");
        System.out.println(s.peek()+" top element");
        System.out.println(s.isEmpty());
    }
}
