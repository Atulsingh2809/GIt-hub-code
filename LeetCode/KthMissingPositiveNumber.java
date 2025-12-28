package LeetCode;

public class KthMissingPositiveNumber 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4};
        int k=2;

        int result = Missing(arr,k);

        System.out.println(result);
        
    }

    // static int Missing(int arr[],int num,int k)
    // {
    //      while(k>0)
    //      {
    //         for(int i=0;i<arr.length;i++)
    //         {
    //             if(num != arr[i])
    //             {
    //                 k--;
    //             }
    //             num++;
    //         }
            
    //         return num;
    //      }
    //      return-1;

    // }

    static int Missing(int arr[],int k)
    {
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end)
        {
            int mid = start + (end-start)/2;

            int MissingNo = arr[mid]-(mid+1);

            if(MissingNo < k )
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return k + start;


    }
    
}
