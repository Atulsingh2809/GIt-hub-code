package Practise;

import java.util.ArrayList;

public class SieveOfEratosthenes 
{
    public static void main(String[] args) 
    {
        int range = 30;

        ArrayList<Integer> ar = sieve(range);

        System.out.println(ar);
    }

    public static ArrayList<Integer> sieve(int n)
    {
        boolean[] isPrime = new boolean[n + 1];

        for(int i = 2; i <= n; i++)
        {
            isPrime[i] = true;
        }

        for(int i = 2; i * i <= n; i++)
        {
            if(isPrime[i])
            {
                for(int j = i * i; j <= n; j += i)
                {
                    isPrime[j] = false;
                }
            }
        }

        ArrayList<Integer> primes = new ArrayList<>();

        for(int i = 2; i <= n; i++)
        {
            if(isPrime[i])
            {
                primes.add(i);
            }
        }

        return primes;
    }
}