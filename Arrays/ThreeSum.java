package Arrays;

import java.util.*;

public class ThreeSum 
{
    public static void main(String[] args) 
    {
        int nums[] = {-1,0,1,2,-1,-4};
        
        System.out.println(Trsum(nums));

        
    }

    static List<List<Integer>> Trsum(int nums[])
    {

        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;

        if(n<3)
        {
            return result;
        }

        Arrays.sort(nums);

        for(int i=0;i<n;i++)
        {
            if(i>0 && nums[i] ==  nums[i-1])
            {
                continue;
            }

            int target = -nums[i];
            Twsum(nums, target,i+1,n-1, nums[i], result);
        }

        return result;


    }

    static void Twsum(int nums[], int target, int start , int end, int firstNum, List<List<Integer>> result)
    {
        
        while(start < end)
        {
            if(nums[start]+nums[end] > target)
            {
                end--;
            }
            else if( nums[start]+nums[end]< target)
            {
                start++;
            }
            else
            {
                while(start<end && nums[start] == nums[start+1])start++;

                while(start<end && nums[end] == nums[end-1])end--;

                result.add(Arrays.asList(firstNum, nums[start], nums[end]));

                start++;
                end--;
            }

        }

    }
    
}
