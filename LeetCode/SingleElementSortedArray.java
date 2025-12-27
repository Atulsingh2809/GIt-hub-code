package LeetCode;

public class SingleElementSortedArray 
{
    public static void main(String[] args) 
    {
        int nums[] = {3,3,7,7,10,11,11};
        int result = SingleElement(nums);
        System.out.println(result);

        
    }
    
    static int SingleElement(int nums[])
    {
        int start = 0;
        int end =  nums.length-1;

        while(start < end)
        {
            int mid = start +(end-start)/2;
            
            Boolean isEven;

            if((end-mid)%2 == 0)
            {
               isEven = true;
            }
            else
            {
                isEven = false;
            }


            if(nums[mid] == nums[mid+1])
            {

                if(isEven)
                {
                    start = mid+2;
                }
                else
                {
                    end = mid-1;
                }
            }
            else if(nums[mid] != nums[mid+1])
            {
                if(isEven)
                {
                    end =mid;
                }
                else
                {
                   start = mid+1;
                }

            }
        }
        return nums[end];

    }

    
}
