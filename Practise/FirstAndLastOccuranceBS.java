package Practise;
import java.util.*;

public class FirstAndLastOccuranceBS 
{
    public static void main(String[] args) 
    {
        int arr[] = {5,8,10,10,10,10,10,11,13};

        System.out.println(Arrays.toString(searchRange(arr, 10)));

        
    }
    public static int[] searchRange(int arr[], int target)
    {
        int ans[] = {-1,-1};

        int start =  search(arr, target, true);
        int end = search(arr, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    public static int search(int arr[] , int target, Boolean firstStartIndex)
    {
        int ans=-1;

        int start = 0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid  = start+(end-start)/2;

            if(target>arr[mid])
            {
                start = mid+1;
            }
            else if(target<arr[mid])
            {
                end = mid-1;
            }
            else
            {
                ans = mid;
                if(firstStartIndex)
                {
                    end = mid-1;
                }
                else
                {
                    start = mid+1;
                }
            }
        }
        return ans;

    }
    
}
