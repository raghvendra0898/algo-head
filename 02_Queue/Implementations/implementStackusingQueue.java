//Implementation of stack using two queues
/*
There are two methods for implementing this.
1. by making push operation costly
2. by making pop operation costly.

In this we are using push operation costly method.
 */

import java.util.*;
import java.util.Queue;

public class implementStackusingQueue
{
    static class stack
    {
        static Queue<Integer> q1 = new LinkedList<Integer>();
        static Queue<Integer> q2 = new LinkedList<Integer>();

        static int curr_size;

        stack()
        {
            curr_size=0;
        }

        static void push(int x)
        {
            curr_size++;

            q2.add(x);

            while(!q1.isEmpty())
            {
                q2.add(q1.peek());
                q1.remove();
            }
            Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;
        }
        static void pop()
        {
            if(q1.isEmpty())
                return;
            q1.remove();
            curr_size--;
        }
        static int top()
        {
            if(q1.isEmpty())
                return -1;
            return q1.peek();
        }
        static int size()
        {
            return curr_size;
        }
    };    

    public static void main(String args[])
    {
        
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("current size : "+stack.size());
        System.out.println(stack.top()); 
        stack.pop(); 
        System.out.println(stack.top()); 
        stack.pop(); 
        System.out.println(stack.top()); 
    
        System.out.println("current size: " + stack.size());
    }
}
