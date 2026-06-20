package Practise;
import java.util.*;


public class ContainDuplicates
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,1};

        System.out.println(Duplicates(arr));

        
    }

    static boolean Duplicates(int arr[])
    {
        Set<Integer> inset = new HashSet<>();

        for(int nums : arr)
        {
            if(inset.contains(nums))
            {
                return true;
            }
            inset.add(nums);
        }
        return false;
    }


}