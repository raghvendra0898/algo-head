import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReversedQueue {
    static void reverse(Queue <Integer> q)
    {
        Stack<Integer>s = new Stack<>();
        while(!q.isEmpty())
        {
            s.push(q.poll());
        }
        while(!s.isEmpty())
        {
            q.add(s.peek());
            s.pop();       
        }
        System.out.println("Reversed queue : "+ q);
 
    }

    public static void main(String args[])
    {
        Queue <Integer> q = new LinkedList<Integer>();
        q.add(5);
        q.add(16);
        q.add(65);
        q.add(24);
        q.add(2);

        System.out.println("Elements in original queue : "+ q);

        reverse(q);


    }
}
