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

