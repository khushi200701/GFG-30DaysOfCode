//Given a matrix of size N x M. You have to find the Kth element which will obtain while traversing the matrix spirally starting from the top-left corner of the matrix.

import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			Solution obj = new Solution();
			System.out.println(obj.findK(arr, n, m, k));
		t--;
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{
   
	public int findK(int a[][], int n, int m, int k)
	{
	     int direction = 1;
        int right = m-1;
        int bottom = n-1;
        int left = 0;
        int top = 0;
        while (k != 0) {
            if (direction % 4 == 1) {
                int i = top;
                int j = left;
                while (j <= right) {
                    k--;
                    if (k == 0) {
                        return a[i][j];
                    }
                    j++;
                }
                top++;
                direction++;
            } else if (direction % 4 == 2) {
                int i = top;
                int j = right;
                while (i <= bottom) {
                    k--;
                    if (k == 0) {
                        return a[i][j];
                    }
                    i++;
                }
                right--;
                direction++;
            } else if (direction % 4 == 3) {
                int i = bottom;
                int j = right;
                while (j >= left) {
                    k--;

                    if (k == 0) {
                        return a[i][j];
                    }
                    j--;
                }
                bottom--;
                direction++;
            } else {
                int i = bottom;
                int j = left;
                while (i >= top) {
                    k--;

                    if (k == 0) {
                        return a[i][j];
                    }
                    i--;
                }
                left++;
                direction++;
            }
        }
    return 0;
	}
	
}
