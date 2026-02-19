package LeetCode;

public class CountPrimeDuplicate 
{
    public static void main(String[] args) 
    {
         int n = 100;
         int res = countPrime(n);
          System.out.println(res);
        
    }

    static int countPrime(int n)
    {
        int count = 0;
        if(n<2)
            return count = n; 

        for(int i=2;i<n;i++)
        {
            Boolean result = checkPrime(i);
            if(result == true)
            {
                count++;
            }
        }
        return count;

    }

    static Boolean checkPrime(int a)
    {
        for(int i=2;i<a;i++)
        {
            if(a%i == 0)
            {
                return false;
            }
        }
        return true;

    }
    
}
