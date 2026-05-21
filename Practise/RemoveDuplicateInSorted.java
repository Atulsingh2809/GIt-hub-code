package Practise;

import java.util.*;

public class RemoveDuplicateInSorted
{
    public static void main(String[] args) 
    {
        int arr[] = {1,1,2};
        removeDuplicate(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    public static List<Integer> removeDuplicate(int arr[])
    {
        ArrayList<Integer>result = new ArrayList<>();

        if(arr.length == 0)
        {
            result.add(0);
        }

        int i=0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j] != arr[i])
            {
                i++;
                arr[i] = arr[j];
                result.add(i);
            }
        }
        return result;
    }


}