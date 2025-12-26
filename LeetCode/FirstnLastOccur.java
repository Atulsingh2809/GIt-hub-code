package LeetCode;

public class FirstnLastOccur 
{
    public static void main(String[] args) 
    {
        int arr[] = {5,7,7,8,8,10};
        int target = 8;

        int ans[] = {-1,-1};

        int start = SearchForNo(arr, target, true);
        int end = SearchForNo(arr, target, false);


        // ans[0] = start;
        // ans[1] = end;

        System.out.println(start);
        System.out.println(end);
      
    }


    static int SearchForNo(int arr[],int target, Boolean firstStartIndex)
    {
        int ans = -1;
        int start = 0;
        int end = arr.length-1;

        while(start <= end)
        {
            int mid  = start + (end - start)/2;

            if(target < arr[mid])
            {
                end = mid-1;
            }
            else if(target > arr[mid])
            {
                start = mid+1;
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
   

