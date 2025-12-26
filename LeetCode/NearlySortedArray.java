package LeetCode;

public class NearlySortedArray 
{
    //modified Binary Search

    public static void main(String[] args)
    {
        int arr[] = {5,10,30,20,40};
        int target = 20;

        int result  = BS(arr, target);

        System.out.println(result);
        
    }

    static int BS(int arr[],int target)
    {
        int start = 0;
        int end = arr.length-1;
        

        while(start <= end)
        {
            int mid = start +(end-start)/2;

                
                if(target == arr[mid])
                {
                    return mid;
                }
                if(mid>start && target == arr[mid-1])
                {
                    return mid-1;
                }
                if(mid<end && target == arr[mid+1])
                {
                    return mid+1;
                }

            if(target<arr[mid])
            {
                end = mid-2;
            }
            else 
            {
                start = mid+2;
            }
            
        }
        return -1;


    }
    
}
