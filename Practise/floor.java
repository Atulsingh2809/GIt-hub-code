package Practise;

public class floor 
{
    public static void main(String[] args) 
    {
        int arr[]  = {12,23,34,46,56};
        int target = 45;

        System.out.println(BS(arr, target));
 
        
    }

    public static int BS(int arr[] ,int target)
    {
        int start = 0;
        int end = arr.length;

        while(start <= end)
        {
            int mid  = start+(end-start)/2;

            if(target == arr[mid])
            {
                return arr[mid];
            }
            else if(target>arr[mid])
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return arr[end];

    }
    
}
