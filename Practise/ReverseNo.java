package Practise;

public class ReverseNo 
{
    public static void main(String[] args) 
    {
        int numb = 248;

        System.out.println(reverse(numb));
        
    }

    public static int reverse(int n)
    {
        int z=0;
        while(n>0)
        {           
            int y = n%10;
            z = z*10+y;
            n = n/10;
        }
        return z;
    }
    
}
