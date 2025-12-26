package LeetCode;

public class FindTheMissingNo 
{
    public static void main(String[] args) 
    {
        int arr[] = {78,79,81,82};
        
        int ans = Miss(arr);

        System.out.println(ans);
        
    }

    static int Miss(int arr[])
    {
     
        int i=0;
        int incre = arr[i];
        
        for(i=0;i<arr.length;i++)
        {
            
            if(incre != arr[i])
            {
                break;
            }
            incre++;

        }
        return incre;
    


    }
    
}
