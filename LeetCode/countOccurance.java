package LeetCode;

public class countOccurance
{
    public static void main(String[] args) 
    {
        int nums[] = {1,4,8,8,8,9,12};
        int target = 8;

        System.out.println(countOccurrences(nums, target));
        
        
    }

    public static int countOccurrences(int[] nums, int target) 
    {
        int ans = 0;
        int start = search(nums,target,true);
        int end = search(nums,target,false);

        ans = (end - start)+1;

        return ans;
        
    }


    public static int search(int nums[],int target,boolean traverse)
    {
        int ans=-1;
        int start = 0;
        int end = nums.length-1;

        while(start <= end)
        {
            int mid = start + (end -start)/2;

            if(target < nums[mid])
            {
                end = mid-1;
            }
            else if(target > nums[mid])
            {
                start = mid+1;
            }
            else
            {
                ans = mid;
                if(traverse)
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