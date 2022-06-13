// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int phy[] = new int[n];
    		int chem[] = new int[n];
    		int math[] = new int[n];
            
            for (int i = 0; i < n; ++i)
                {
                    phy[i]=sc.nextInt();
                    chem[i]=sc.nextInt();
                    math[i]=sc.nextInt();
                }
		    
		    Solution ob = new Solution();
		    
		    ob.customSort (phy, chem, math, n);
    		for (int i = 0; i < n; ++i)
    			System.out.println(phy[i]+" " + chem[i] + " " + math[i]);

        }
        
    }
}// } Driver Code Ends


//User function Template for Java
class Pair implements Comparable<Pair>
{
    int p, c, m;
    
    Pair(int p, int c, int m)
    {
        this.p = p;
        this.c = c;
        this.m = m;
    }
    
    
    public int compareTo(Pair x)
    {
        if(p!=x.p)
        {
            return p-x.p;
        }
        else
        {
            if(c!=x.c)
            {
                return x.c-c;
            }
            else
            {
                return m-x.m;
            }
        }
    }
    
}
class Solution
{
    
    public void customSort (int phy[], int chem[], int math[], int N)
    {
        // your code here
        Pair pair[] = new Pair[N];
        
        for(int i=0; i<N; i++)
        {
            pair[i] = new Pair(phy[i], chem[i], math[i]);
        }
        
        Arrays.sort(pair);
        
        for(int i=0; i<N; i++)
        {
            phy[i] = pair[i].p;
            chem[i] = pair[i].c;
            math[i] = pair[i].m;
        }
     
    }
}
