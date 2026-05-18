package Practise;

public class factorialOfNo 
{
    public static void main(String[] args) 
    {
        double numb = 40;
        System.out.println(factorial(numb));
        
    }

    public static double factorial(double n)
    {
        // double fact = 1;
        // for(int i=1;i<=n;i++)
        // {
        //     fact*=i;

        // }
        // return fact;

        if(n==1)
            return 1;

        return n*factorial(n-1);

    }
    
}
