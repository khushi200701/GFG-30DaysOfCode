//Geek Land has a population of N people and each person's ability to rule the town is measured by a numeric value arr[i]. The two people that can together rule Geek Land must be compatible with each other i.e., the sum of digits of their ability arr[i] must be equal. Their combined ability should be maximum amongst all the possible pairs of people. Find the combined ability of the Ruling Pair.

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
