package LeetCode;
import java.util.*;

public class CheckPrime 
{
    public static void main(String[] args) 
    {
        int n =100;
        checkPrime(n);
    
        
    }

    static void checkPrime(int n)
    {
        int count =0;

        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i == 0)
            {
                count++;
            }
        }
        if(count == 0)
        {
            System.out.println("no is prime");
        }
        else
        {
            System.out.println("no is not prime");
        }
    }
  
   



    
}
