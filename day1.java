//Geek and his classmates are playing a prank on their Computer Science teacher. They change places every time the teacher turns to look at the blackboard. 

Each of the N students in the class can be identified by a unique roll number X and each desk has a number i associated with it. Only one student can sit on one desk. 
Each time the teacher turns her back, a student with roll number X sitting on desk number i gets up and takes the place of the student with roll number i.

If the current position of N students in the class is given to you in an array, such that i is the desk number and a[i] is the roll number of the student sitting on the desk, can you modify a[ ] to represent the next position of all the students ? 



import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());
            
            String input_line[] = read.readLine().trim().split("\\s+");
            long a[]= new long[n];
            for(int i = 0; i < n; i++)
                a[i] = Long.parseLong(input_line[i]);

            Solution ob = new Solution();
            ob.prank(a, n); 

            for (int i=0;i<n;i++) 
                System.out.print(a[i]+" "); 
            System.out.println();
        }
    } 
} 


//User function Template for Java
class Solution 
{ 
    void prank(long[] a, int n)  
    { 
        for(int i = 0; i < n; i++) {
a[i] += (a[(int)a[i]] % n) * n;
}
for(int i = 0; i < n; i++) {
a[i] = a[i] / n;
}
    }
} 
