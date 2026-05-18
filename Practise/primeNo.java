package Practise;

import java.util.ArrayList;
import java.util.Scanner;
public class primeNo 
{
    public static void main(String[] args) 
    {
        System.out.println("enter a range");
        Scanner scan = new Scanner(System.in);
        int range = scan.nextInt();
        
        ArrayList<Integer> ar = new ArrayList<>();

        for(int i=2;i<=range;i++)
        {
            if(isPrime(i) == true)
            {
               ar.add(i);
            }
        }
        System.out.println(ar);
        
    }


    public static Boolean isPrime(int n)
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
    

        }
        return true;

    }


    
}
