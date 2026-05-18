package Practise;

public class sumOfDigit 
{
    public static void main(String[] args) 
    {
         int numb = 123;

         System.out.println(sum(numb));
        
    }

    public static int sum(int n)
    {
        int z=0;
        while(n>0)
        {
            int y = n%10;
            z = z+y;
            n = n/10;
            

        }
        return z;
    }
    
}
