package Arrays;

public class TrappingRainWater 
{
    public static void main(String[] args) 
    {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(trappedWater(height));
        
    }

    static int trappedWater(int height[])
    {
        if(height == null || height.length == 0)
        {
            return 0;
        }

        int left = 0;
        int right = height.length-1;
        int leftmax = 0;
        int rightmax  = 0;
        int waterTrapped = 0;

        while(left < right)
        {
            if(height[left] < height[right])
            {
                if(height[left]>= leftmax)
                    leftmax = height[left];
                else
                    waterTrapped+=leftmax-height[left];
                left++;
            }
            else
            {
                if(height[right]>= rightmax)
                {
                    rightmax = height[right];
                }
                else
                    waterTrapped+=rightmax-height[right];
                right--;
            }
        }
        return waterTrapped;


    }
    
}
