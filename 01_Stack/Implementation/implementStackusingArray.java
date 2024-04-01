class Stack
{
    int arr[];
    int cap;
    int top;

    Stack(int c)
    {
        cap = c;
        top = -1;
        arr = new int[cap];
    }

    void push(int x)
    {
        top++;
        arr[top] = x;
    }

    int pop()
    {
        int res = arr[top];
        top--;
        return res;
    }

    boolean isEmpty()
    {
        return (top==-1);
    }

    int size()
    {
        return top+1;
    }
}
public class implementStackusingArray
{
    public static void main(String args[])
    {
        Stack s = new Stack(10);
        s.push(15);
        s.push(13);
        System.out.println(s.pop()+" element is removed");
        s.push(18);
        System.out.println(s.size() + " size of the stack");

    }
}