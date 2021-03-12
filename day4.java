//A drawer contains socks of n different colours. The number of socks available of ith colour is given by a[i] where a is an array of n elements. Tony wants to take k pairs of socks out of the drawer. However, he cannot see the colour of the sock that he is picking. You have to tell what is the minimum number of socks Tony has to pick in one attempt from the drawer such that he can be absolutely sure, without seeing their colours, that he will have at least k matching pairs.



import java.io.*;
import java.util.*;
class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n, k, ans;
            n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            k = sc.nextInt();
            Solution obj = new Solution();
            ans = obj.find_min(a, n, k);
            System.out.println(ans);
            t--;
        }
    }
}




class Solution {
    public int find_min(int[] a, int n, int k) {
        int socks=0,sum=0,max=0;
        
        for(int i=0;i<n;i++)
        {
            max+=a[i]/2;
                if(a[i]%2==0)
                sum+=(a[i]-2)/2;
                else
                sum+=(a[i]-1)/2;
        
        }
        
        if(k>max)
        return -1;
        
        if(k>sum)
        {
            socks=(2*sum) + n + (k-sum);
        }
        else if(k<=sum)
        {
            socks=(2*(k-1)) + n + 1;
        }
        
        
        return socks;
    }
}
