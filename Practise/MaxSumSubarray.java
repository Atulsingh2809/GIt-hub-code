package Practise;

public class MaxSumSubarray
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5};
        System.out.println(maxSubarray(arr));
        
    }

    public static int maxSubarray(int arr[])
    {
        int sum =0;
        int max = 0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<i+2;j++)
            {
               sum+=arr[j];
            }
            if(max<sum)
            {
                max = sum;
            }
        }
        return max;

    }
}