//Given an array of size N, find the smallest positive integer value that cannot be represented as sum of some elements from the array.


import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            long array[] = new long[n];
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextLong();
            }
            Solution ob = new Solution();
            System.out.println(ob.smallestpositive(array,n));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution { 
    long smallestpositive(long[] array, int n)
    {
        Arrays.sort(array);
        long res=1;
        
        for(int i=0;i<n;i++)
        {
            if (array[i]<=res)
                 res+=array[i];
        }
        return res;
        
    }
} 
