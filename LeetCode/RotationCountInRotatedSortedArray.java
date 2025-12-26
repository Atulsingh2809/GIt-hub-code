package LeetCode;

public class RotationCountInRotatedSortedArray 
{
    public static void main(String[] args) 
    {
        int arr[] = {15,18,2,3,6,12};
        int pivot = findpivot(arr);
        int ans = pivot+1;

        System.out.println(ans);
        
    }

    static int findpivot(int arr[])
    {
        int start = 0;
        int end = arr.length-1;

        while(start <= end)
        {
             int mid = start+(end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            else if(arr[mid]<arr[start])
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return -1;
    }
    
}
