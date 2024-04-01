//Generating 'n' numbers having digit 5 and 6 in it only.
import java.util.LinkedList;
import java.util.Queue;



public class GenerateAFixedDigitNumbers {
    static void fixed(int n)
    {
        Queue<String> q = new LinkedList<String>();
        q.add("5");
        q.add("6");

        for(int i=0; i<n; i++)
        {
            String curr = q.poll();
            System.out.print(curr + " ");
            q.add(curr+"5");
            q.add(curr+"6");
        }

    }
    
    public static void main(String args[])
    {
        fixed(10);
    }
}
