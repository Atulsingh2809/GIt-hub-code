package Practise;

public class MaximumSubarray
{
    public static void main(String[] args) 
    {
        int arr[] = {5,4,-1,7,8};

        System.out.println(maxSub(arr));


        
    }

    static int maxSub(int arr[])
    {
        int curr_max = arr[0];
        int max_so_far = arr[0];

        for(int i=1;i<arr.length;i++)
        {
            curr_max = Math.max(arr[i], curr_max+arr[i]);
            max_so_far = Math.max(curr_max, max_so_far);
        }

        return max_so_far;
    }
}