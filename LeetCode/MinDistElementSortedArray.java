package LeetCode;

public class MinDistElementSortedArray 
{
    public static void main(String[] args) 
    {
        int arr[]={5,6,8,10,12,15};
        int target = 14;

        int result = MinDist(arr, target);

        System.out.println(result);

        
    }
    

    static int MinDist(int arr[],int target)
    {
        int start = 0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = start + (end-start)/2;

            if(target<arr[mid])
            {
                end =  mid-1;
            }
            if(target>arr[mid])
            {
                start = mid+1;
            }
            else
            {
                return mid;
            }
        }
        if((arr[start]-target) > arr[end]-target)
        {
            return arr[start];
        }
        else
        {
            return arr[end];
        }


    }
    
}
