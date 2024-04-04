//{ Driver Code Starts
    import java.util.*;


    class circulartour
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t =sc.nextInt();
            while(t>0)
            {
                int n = sc.nextInt();
                sc.nextLine();
                String str = sc.nextLine();
                String arr[] = str.split(" ");
                int p[] = new int[n];
                int d[] = new int[n];
                int j=0;
                int k=0;
                for(int i=0; i<2*n; i++)
                {
                    if(i%2 == 0)
                    {
                        p[j]= Integer.parseInt(arr[i]);
                        j++;
                    }
                    else
                    {
                        d[k] = Integer.parseInt(arr[i]);
                        k++;
                    }
                }
                
                System.out.println(new Solution().tour(p,d));
            t--;
            }
            sc.close();
        }
    }
    // } Driver Code Ends
    
    
    // In java function tour() takes two arguments array of petrol
    // and array of distance
    
    class Solution
    {
        //Function to find starting point where the truck can start to get through
        //the complete circle without exhausting its petrol in between.
        int tour(int petrol[], int distance[])
        {
        // Your code here
            int n = petrol.length;
            int begin = 0;
            int end = 1;
            int cap = petrol[begin] - distance[begin];
            
            while(begin!=end ||cap<0)
            {
                while(begin!=end && cap<0)
                {
                    cap = cap - (petrol[begin]-distance[begin]);
                    begin = (begin+1)%n;
                    
                    if(begin==0)
                        return -1;
                }
                cap = cap + (petrol[end]-distance[end]);
                end = (end+1)%n;
            }
            return begin;
        }
    }