package Practise;
import java.util.*;

public class FindDuplicate 
{
    public static void main(String[] args) 
    {

        int arr[] = {5,1,2,2,3,3,3,4,4,6,8};
        System.out.println(duplicate(arr));
    }

    public static ArrayList<Integer> duplicate(int arr[])
    {
        ArrayList<Integer> ans  = new ArrayList<>();

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i] == arr[i+1])
            {
                ans.add(arr[i]);
            }
        }
        return ans;

    }
    
}
