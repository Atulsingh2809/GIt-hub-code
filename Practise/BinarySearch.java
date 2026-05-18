package Practise;

public class BinarySearch 
{
    public static void main(String[] args) 
    {
        int arr[] = {67,45,23,12,11};
        int target = 23;

        System.out.println(BS(arr, target));
        
    }

    public static int BS(int arr[], int target)
    {
        int start = 0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = start+(end-start)/2;

            if(target>arr[mid])
            {
                start= mid+1;
            }
            else if(target< arr[mid])
            {
                end = mid-1;
            }
            else
            {
                return arr[mid];
            }
        }
        return -1;
    }


    
}
