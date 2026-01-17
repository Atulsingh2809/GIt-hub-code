package LeetCode;

import java.util.*;


public class LargestNumber 
{
    public static void main(String[] args) 
    {
        int nums[] = {3,30,34,5,9};

        System.out.println(LargestNumber(nums));
        
    }

    static String LargestNumber(int nums[])
    {
       String[] arr = new String[nums.length];
        
        for (int i = 0; i < nums.length; i++) 
        {
            arr[i] = String.valueOf(nums[i]);
        }

        
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        if (arr[0].equals("0")) 
        {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for (String s : arr) 
        {
            result.append(s);
        }

        return result.toString();
    }
    
}
