//Geek wants to make a special space for candies on his bookshelf. Currently, it has N books of different heights and unit width. Help him select 2 books such that he can store maximum candies between them by removing all the other books from between the selected books. The task is to find out the area between 2 books that can hold the maximum candies without changing the original position of selected books. 

import java.io.*;
import java.util.*; 

 // } Driver Code Ends
//User function Template for Java

class Solution 
{ 
	static int maxCandy(int a[], int n) 
	{ 
	    int start=0, end=n-1, maxarea=0;
	    
	    while(start<end)
	    {
	        int area=Math.min(a[start],a[end])*(end-start-1);
	        maxarea=Math.max(area,maxarea);
	        
	        if(a[start]<a[end])
	        start++;
	        else
	        end--;
	    }
	    return maxarea;
	    // Your code goes here
	}
}

// { Driver Code Starts.
class GFG{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int height[] = new int[n];
            for (int i = 0; i < n; ++i)
            {
                height[i] = sc.nextInt();
            }

            Solution ob = new Solution();
            System.out.println(ob.maxCandy(height,n));
            t--;
        }
	} 
} 
