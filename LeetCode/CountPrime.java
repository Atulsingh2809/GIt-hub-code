package LeetCode;

public class CountPrime 
{
    public static void main(String[] args) 
    {
        int n = 10;

        System.out.println(CountPrime(n));
             

    }

    static int CountPrime(int n)
    {
        int count =0;

        if(n==0 || n == 1)
        {
            return 0;
        }

        Boolean isPrime[] = new Boolean[n];

        for(int i=2;i<n;i++)
        {
            isPrime[i] = true;
        }

        for(int i=2;i*i<n;i++)
        {
            if(isPrime[i] == true)
            {
                for(int j=2;i*j<n;j++)
                {
                    isPrime[i*j]= false;
                }
            }
        }

        for(int i=2;i<n;i++)
        {
            if(isPrime[i] == true)
            {
                count++;
            }
        }
        return count;
    }
   
    
  
    
}
