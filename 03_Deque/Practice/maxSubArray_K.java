//{ Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.util.LinkedList;
import java.util.Deque;



public class maxSubArray_K
{
    public static void main(String args[])
    {
        //taking input using class Scanner
        Scanner sc = new Scanner(System.in);
              
        
            //taking total number of elements
            int n = sc.nextInt();
            
            //taking size of subArrays 
            int k = sc.nextInt();
            
            //Declaring and Intializing an array of size n
            int arr[] = new int[n];
            
            //adding all the elements to the array 
            for(int i = 0; i <n; i++)
            {
                arr[i] =sc.nextInt();
            }
            
            //Calling the method max_of_subarrays of class solve
            //and storing the result in an ArrayList
            ArrayList <Integer> res = max_of_subarrays(arr, n, k);
            
            //printing the elements of the ArrayList
            for (int i = 0; i < res.size(); i++)
                System.out.print (res.get (i) + " ");
            System.out.println();
            sc.close();
        }
// } Driver Code Ends


//User function template for JAVA

  //Function to find maximum of each subarray of size k.
    public static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> al = new ArrayList<Integer>();
        Deque<Integer> deq = new LinkedList<Integer>();
        
        for(int i=0; i<k; i++)
        {
            while(!deq.isEmpty() && arr[i]>=arr[deq.peekLast()])
                deq.removeLast();
            deq.addLast(i);
        }
        
        for(int i=k; i<n; i++)
        {
            al.add(arr[deq.peek()]);
            while(!deq.isEmpty() && deq.peek()<=i-k)
                deq.removeFirst();
            while(!deq.isEmpty() && arr[i]>=arr[deq.peekLast()])
                deq.removeLast();
            deq.addLast(i);
        }
        al.add(arr[deq.peek()]);
        return al;
    }
}