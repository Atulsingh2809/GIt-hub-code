package LeetCode;

public class FairDistributionOFCookies 
{
    int result = Integer.MAX_VALUE;
    int n;
    public static void main(String[] args) 
    {
        int[] cookies = {8,15,10,20,8};
        int k = 2;
        System.out.println(new FairDistributionOFCookies().partitionCookies(cookies, k));
        
    }

    public int partitionCookies(int[] cookies, int k) 
    {
        n=cookies.length;
        int children[] = new int[k];
        backtrack(0,cookies,children,k);
        return result;
        
    }

    public void backtrack(int index,int[] cookies,int[] children,int k)
    {
        if(index == n)
        {
            int unfairness = Integer.MIN_VALUE;
            for(int i=0;i<k;i++)
            {
                unfairness = Math.max(unfairness, children[i]);
            }
            result = Math.min(result, unfairness);
            return;
        }

        for(int i=0;i<k;i++)
        {
            children[i] += cookies[index];
            backtrack(index+1,cookies,children,k);
            children[i] -= cookies[index];
        }

    }
}
