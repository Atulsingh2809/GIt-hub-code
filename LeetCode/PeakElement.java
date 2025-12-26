package LeetCode;

public class PeakElement 
{
    public static void main(String[] args) 
    {
        int arr[] = {12,23,25,28,30,38,14,10,6,5,1};

        System.out.println(peak(arr));
        
    }

    static int peak(int arr[])
    {
        int start = 0;
        int end  = arr.length-1;

        while(start < end)
        {
            int mid = start + (end-start)/2;

            if(arr[mid]>arr[mid+1])
            {
                end = mid;
            }
            else
            {
                start = mid+1;
            }

        }
        return start;

    }
    
}
    