package LeetCode;

public class FourDivisor 
{
    public static void main(String[] args) 
    {
        int nums[] = {21,4,7};
        int res = sumOfDivisor(nums);

        System.out.println(res);

        
    }

    static int max(int nums[])
    {
        int max = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i])
            {
                max = nums[i];
            }
            
        }
        return max;
    }

    static int sumOfDivisor(int nums[])
    {
        int maximum = max(nums);

        for(int i=1;i<nums.length;i++)
        {
            int j=1;
            int sum =0;
            int count =0;
            while(j<=maximum)
            {
                if(nums[i]%j == 0)
                {
                    count++;
                    sum = sum+j;
                }

            }
            if(count == 4)
            {
                return sum;
            }
            

        }
        return -1;

    }
   
}
