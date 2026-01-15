package LeetCode;

public class DivideTwoInteger 
{
    public static void main(String[] args) 
    {
        int dividend = 7;
        int divisor = 3;

        System.out.println(divi(dividend, divisor));
        
        
    }


    static int divi(int dividend, int divisor)
    {
        int s=0;
        int count = 0;
        int result = 0;

    
        while(s<Math.abs(dividend))
        {
            s+=Math.abs(divisor);
            count++;
        }  

        if(divisor == 0 || dividend == 0)
        {
            result = 0;
        }
        else if(divisor == dividend)
        {
            result  = 1;
        }
        else if(divisor == -1 && dividend == 1 || divisor == 1 && dividend == -1)
        {
            result = -1;
        }
        else
        {
             if(divisor<0)
             {
              int res = count-1;
                return -res;
             }
              result= count-1;
        }

       
        return result;
        
    }
    
}
