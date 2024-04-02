import java.util.Stack;
import java.util.Scanner;
public class balancedparenthesis {
    static boolean ispar(String x)
    {
        // add your code here
        Stack <Character> s = new Stack<Character>();
        s.push(x.charAt(0));
        for(int i=1; i<x.length(); i++)
        {
            if(s.isEmpty())
                s.push(x.charAt(i));
            else
            {
                if((int)x.charAt(i)==41 && (int)s.peek()==40)
                    s.pop();
                
                else if((int)x.charAt(i)==93 && (int)s.peek()==91)
                    s.pop();
            
                else if((int)x.charAt(i)==125 && (int)s.peek()==123)
                    s.pop();
            
                else
                    s.push(x.charAt(i));
            }

        }
        return s.isEmpty();
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();      //enter only '[]','{}','()'
        if(ispar(st))
            System.out.println("Parenthesis are balanced");
        else
            System.out.println("Not balanced");

        sc.close();
    }
}
