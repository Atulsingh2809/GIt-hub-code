package LeetCode;

public class SecondLargest
{
    public static void main(String[] args) 
    {
        int nums[] = {10,10,10,10};

        if(nums == null || nums.length <2 || nums[0] == nums[nums.length-1])
        {
            System.out.println("-1");
        }

        int max = nums[0];
        int secMax = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                secMax = max;
                max= nums[i];
            }
            else if(nums[i] != max && nums[i]>secMax)
            {
                secMax = nums[i];
            }
            
        }

        System.out.println(secMax);

        
    }
}