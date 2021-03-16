//Professor McGonagall teaches transfiguration at Hogwarts. She has given Harry the task of changing himself into a cat. She explains that the trick is to analyze your own DNA and change it into the DNA of a cat. The transfigure spell can be used to pick any one character from the DNA string, remove it and insert it in the beginning. 
//Help Harry calculates minimum number of times he needs to use the spell to change himself into a cat.

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String arr[] = br.readLine().split(" ");
                    String A = arr[0];
                    String B = arr[1];
                    Solution obj = new Solution();
                    System.out.println(obj.transfigure (A, B));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    int transfigure (String a, String b)
    {
        if(a.length()!=b.length())
        return -1;
        
        if(!Arrays.equals(a.chars().sorted().toArray(), b.chars().sorted().toArray()))
        return -1;
        
        int ans=0;
        int n=a.length()-1;
        int m=b.length()-1;
        while(n>=0)
        {
            if(a.charAt(n)==b.charAt(m))
            {
                m--;
                ans++;
            }
            n--;
        }
        return a.length()-ans;
    	// Your code goes here.
    }
}
