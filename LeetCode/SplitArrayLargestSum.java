package LeetCode;

public class SplitArrayLargestSum 
{
    public static void main(String[] args) 
    {
        int arr[] = {10,20,30,40};
        int k = 2;

        int result = SplitArray(arr, k);

        System.out.println(result);

        
    }

    static int SplitArray(int arr[],int k)
    {
        int start = 0;
        int end  = 0;

        for(int i=0;i<arr.length;i++)
        {
            start = Math.max(start, arr[i]);
            end = end+arr[i];
        }

        while(start < end)
        {
            int mid = start + (end-start)/2;

            int sum=0;
            int pieces = 1;

            for(int arrs : arr)
            {
                if(sum+arrs>mid)
                {
                    sum = arrs;
                    pieces++;
                }
                else
                {
                    sum=sum+arrs;
                }

            }
            if(pieces > k)
            {
                start = mid+1;
            }
            else
            {
                end = mid;
            }
        }
        return end;

    }
    
}
