import java.util.ArrayDeque;
// import java.util.Stack;

public class StackinCollection {
    public static void main(String args[])
    {
        ArrayDeque <Integer> s = new ArrayDeque<Integer>();
        s.push(30);
        s.push(300);
        s.push(36);
        s.push(334);
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        System.out.println(s.pop()+ " popped element");
    }
}
