
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
        	int n = sc.nextInt();
        	int array[] = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            System.out.println(ob.RulingPair(array,n));
            t--;
        }
    } 
} 
      // } Driver Code Ends


//User function Template for Java

class Solution {
    
    static int digitSum(int n) {
        int sum = 0;
        while (n != 0){
        sum += (n % 10);
        n /= 10;
        }
        return sum;
    }
    
	static int RulingPair(int arr[], int n) { 
	    
	    
	    int map[] = new int[100];
	    int ans=-1;
	    for (int i=0;i<n;i++)
	    {
	        int sum=digitSum(arr[i]);
	        if(map[sum]!=0)
	        {
	            ans= Math.max(ans, map[sum]+arr[i]);
	        }
	        map[sum]=Math.max(map[sum],arr[i]);
	    }
	    return ans;
	    
        // Your code goes here
	}    
} 
