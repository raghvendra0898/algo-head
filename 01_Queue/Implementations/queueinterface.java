// We can implement queue interface using LinkedList class and ArrayDeque class.


import java.util.LinkedList;
import java.util.Queue;
public class queueinterface {
    public static void main(String args[])
    {
        Queue <Integer> queue = new LinkedList<Integer>();
        
        //Adding elements in queue using offer method

        for(int i=0; i<5; i++)
            queue.offer(i);

        //Adding elements in queue using add method

        for(int i = 5; i<10; i++)
            queue.add(i);
        System.out.println(queue.size()+ " is size of the queue");
        //All the elements of the queue
        System.out.println("Elements in queue : " + queue);

        //Getting the first element of the queue without removing it
        System.out.println(queue.peek()+" is first element of the queue");

        //Removing head of the queue
        System.out.println(queue.remove() + " is removed element");

        //To get size of the queue
        System.out.println(queue.size()+ " is size of the queue");

    }
}
