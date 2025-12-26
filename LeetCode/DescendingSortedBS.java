package LeetCode;

public class DescendingSortedBS 
{
    public static void main(String[] args) 
    {
        int arr[] = {20,17,15,14,13,12,10,9,8,4};
        int target = 4;

        int ans = BinarySearch(arr, target);

        System.out.println(ans);
        
    }

    static int BinarySearch(int arr[],int target)
    {
        int start = 0;
        int end  = arr.length-1;

        while(start <= end)
        {
            int mid = start + (end-start)/2;

            if(target > arr[mid])
            {
                end = mid-1;
            }
            if(target < arr[mid])
            {
                start = mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }

    
}