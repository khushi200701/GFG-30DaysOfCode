//In Geekland there is a grid of coins of size N x N. You have to find the maximum sum of coins in any sub-grid of size K x K. Note: Coins of the negative denomination are also possible at Geekland.

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.next());
		while(t-- > 0)
		{
		    int n = Integer.parseInt(sc.next());
		    int a[][] = new int[n][n];
		    
		    for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<n;j++)
		        {
		            a[i][j] = Integer.parseInt(sc.next());
		        }
		    }
		    
		    int k = Integer.parseInt(sc.next());
		    Solution T = new Solution();
		    System.out.println(T.Maximum_Sum(a,n,k));
		}
	}
}// } Driver Code Ends


class Solution
{
    public int Maximum_Sum(int mat[][],int N,int k){
        int r1=0, r2=k, c1=0, c2=k;
        int res=-100, sum=0;
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<k;j++)
            {
                sum+=mat[i][j];
            }
        }
        res=Math.max(res,sum);
        
        int temp=sum;
        while(r2<=N)
        {
            while(c2<N)
            {
                for(int i=r1;i<r2;i++)
                {
                    sum-=mat[i][c1];
                    sum+=mat[i][c2];
                }
                c1++;
                c2++;
                 res=Math.max(res,sum);
                
            }
            c1=0;
            c2=k;
            if(r2==N)
            break;
            for(int i=c1;i<c2;i++)
            {
                temp+=mat[r2][i];
                temp-=mat[r1][i];
            }
            sum=temp;
            r1++;
            r2++;
             res=Math.max(res,sum);
                
        }
        return res;
    }
}
