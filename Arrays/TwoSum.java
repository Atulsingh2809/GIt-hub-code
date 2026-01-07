package Arrays;

import java.util.*;

public class TwoSum 
{
    public static void main(String[] args) 
    {
        int nums[] = {2,7,11,15};
        int target  = 9;

        

        System.out.println(Arrays.toString(Tsum(nums, target)));

        
    }

    static int [] Tsum(int nums[],int target)
    {
        Map<Integer,Integer> map = new HashMap<>(); 

        for(int i=0;i<nums.length;i++)
        {
            int remaining = target - nums[i];

            if(map.containsKey(remaining))
            {
                return new int[]{map.get(remaining),i};
            }

            map.put(nums[i], i);
        }
        return new int []{-1,-1};
    }    

    
}
