package LeetCode;

public class OrderAgnosticBS 
{
    public static void main(String[] args) 
    {
        int arr[] = {20,17,15,14,13};
        int target = 14;

        int ans = OrderAgnosBS(arr, target);

        System.out.println(ans);
        
    }

    static int OrderAgnosBS(int arr[],int target)
    {
        int start = 0;
        int end = arr.length-1;


        if(arr[0]<arr[1])
        {
            while(start <= end)
            {
                int mid = start+(end-start)/2;

                if(target<arr[mid])
                {
                    end = mid-1;
                }
                else if(target>arr[mid])
                {
                    start = mid+1;
                }
                else
                {
                    return mid;
                }
            }
        }
        else
        {
            while(start <= end)
            {
                int mid = start + (end-start)/2;

                if(target>arr[mid])
                {
                    end = mid-1;
                }
                else if(target<arr[mid])
                {
                    start = mid+1;
                }
                else
                {
                    return mid;
                }

            }
        }
        return -1;

    }
    
}
