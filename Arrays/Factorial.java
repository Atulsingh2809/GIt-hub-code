package Arrays;

import java.util.*;

public class Factorial 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

       
        System.out.println(Facto(n));


        scan.close();
        
    }

    static int Facto(int n)
    {
        int s=1;

        while(n>0)
        {
           s=s*n;
           n--;
        }
        return s;
    }
    
}
