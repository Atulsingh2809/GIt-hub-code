package LeetCode;

public class CountPrime 
{
    public static void main(String[] args) 
    {
        
       

    }

    static Boolean CheckPrime(int n)
    {
        
        for(int i=2;i<n;i++)
        {
            if(n%i== 0)
            {
                return false;
            }
                
        }
        return true;
        
    }
    
}
