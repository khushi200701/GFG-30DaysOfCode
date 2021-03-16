//Given two strings A and B, find the minimum number of times A has to be repeated such that B becomes a substring of the repeated A. If B cannot be a substring of A no matter how many times it is repeated, return -1.

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t > 0){
            String A = sc.nextLine();
            String B = sc.nextLine();
            Solution ob = new Solution();
            System.out.println(ob.repeatedStringMatch(A,B));
            t--;
        }
    } 
} 
        

// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
	static int repeatedStringMatch(String a, String b) 
	{ 
	    int count=1;
	    
	    while(!a.contains(b))
	    {
	        a.concat(a);
	        count++;
	    }
	    return count;
        // Your code goes here
	} 
} 

