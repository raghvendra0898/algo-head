import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReversedQueue {
    static void iter_reverse(Queue <Integer> q)
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

    static void recur_reverse(Queue <Integer> q)
    {
        if(q.isEmpty())
            return;
        else
        {
            int x = q.peek();
            q.poll();
            recur_reverse(q);
            q.add(x);
        }

        System.out.println("Reversed queue using recursion : "+q);

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

        iter_reverse(q);
        recur_reverse(q);


    }
}
