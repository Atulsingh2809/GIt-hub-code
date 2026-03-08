package LeetCode;

public class UniquePathEasy 
{
    public static void main(String[] args) 
    {
        int m = 3;
        int n = 2;
        
        System.out.println(uniquePaths(m,n));
    }

    public static int uniquePaths(int m, int n) 
    {      
        int[][] path = new int[m][n];
        return solve(0, 0, m,n, path);
    }

    public static int solve(int i,int j,int m,int n,int path[][])
    {
        if(i==m-1 && j==n-1)
        {
            return 1;
        }

        if(i>=m || j>=n)
        {
            return 0;
        }

        if(path[i][j] != 0)
        {
            return path[i][j];
        }

        int right = solve(i, j+1, m, n, path);
        int down  = solve(i+1, j, m, n, path);

        path[i][j] = right+down;

        return path[i][j];

    } 


    
}
