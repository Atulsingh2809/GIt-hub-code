package Practise;
import java.util.*;

public class TwoSum
{
    public static void main(String[] args) 
    {
        int arr[] = {3,2,4};
    
        System.out.println(Arrays.toString(sum(arr, 6)));
        
    }

    public static int [] sum(int arr[], int target)
    {
        Map<Integer,Integer> mp = new HashMap<>(); 
        
        for(int i=0;i<arr.length;i++)
        {
            int remaining = target-arr[i];

            if(mp.containsKey(remaining))
            {
                return new int[]{mp.get(remaining),i};

            }
            mp.put(arr[i], i);
        }
        return new int[]{-1,-1};

    }
}