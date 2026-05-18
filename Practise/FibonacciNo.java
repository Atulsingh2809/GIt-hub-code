package Practise;

public class FibonacciNo 
{
    public static void main(String[] args) 
    {
        int range = 6;
        System.out.println(fibonacci(range));
        
    }

    public static int fibonacci(int n)
    {
        if(n<=1)
        {
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
    
}
