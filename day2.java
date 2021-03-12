//Given a positive integer N. You have to find Nth natural number after removing all the numbers containing digit 9.

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner ob=new Scanner(System.in);
		int t=ob.nextInt();
		while(t-->0)
		{
		    long n=ob.nextLong();
		    Solution ab=new Solution();
		    long k=ab.findNth(n);
		    System.out.println(k);
		}
	}
}
class Solution {
    long findNth(long N)
    {
        long ans=0;
        long m=1;
        while(N!=0)
        {
            long dig=N%9;
            N=N/9;
            ans+=m*dig;
            m=m*10;
        }
        return ans;
       
    }
}
