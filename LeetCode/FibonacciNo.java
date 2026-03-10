package LeetCode;

public class FibonacciNo
{
    public static void main(String[] args) 
    {
        int n = 5;
        int dp[] = new int[n];
        for(int i=0;i<n;i++)
        {
                dp[i] = -1;
        } 
        for(int i=0;i<n;i++)
        {
            System.out.print(fibo(i,dp)+ " ");
        }
    }

    public static int fibo(int n,int dp[])
    {
        if(dp[n] != -1)
        {
            return dp[n];
        }
        if(n == 0)
        {
            return 0;
        }
        else if(n == 1)
        {
            return 1;
        }
        else
        {
            return fibo(n-1,dp)+fibo(n-2,dp);
        }

        
    }
}