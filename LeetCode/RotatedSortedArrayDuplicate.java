package LeetCode;

public class RotatedSortedArrayDuplicate 
{
    public static void main(String[] args) 
    {
        int arr[] = {2};
        int target = 3;
        Boolean ans = search(arr,target);

        System.out.println(ans);
        
    }



    static Boolean search(int arr[],int target)
    {
        int pivot = findpivotWithDuplicate(arr);

        if(pivot == -1)
        {
            return BS(arr, target, 0, arr.length-1);
        }
        else if(arr[pivot] == target)
        {
            // return pivot;
            return true;
        }
        else if(target > arr[0])
        {
            return BS(arr, target, 0, pivot-1);
        }
        else
        {
            return BS(arr, target, pivot+1, arr.length-1);
        }


    }



    static int findpivotWithDuplicate(int arr[])
    {
        int start = 0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = start+(end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }

            // if middle, start , end element are same then just skip the elements
            else if(arr[mid] == arr[start] && arr[mid] == arr[end])
            {
                //skip the duplicates

                //NOTE :- if the element at start and end end are pivot??
                // check the pivot case before skipping it.

                if(arr[start]>arr[start+1])
                {
                    return start;
                }
                start++;

                if(arr[end-1]>arr[end])
                {
                    return end-1;
                }
                end--;
            }

            else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end]))
            {
                start = mid+1;
            }
            else 
            {
                end = mid-1;
            }
        }
        return -1;

    }


    static Boolean BS(int arr[],int target,int start,int end)
    {
        while(start <= end)
        {
            int mid = start + (end-start)/2;

            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                return true;
            }
        }
        return false;
        

    }
    
}
