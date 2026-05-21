package Practise;

import java.util.ArrayList;

public class DisappearedNo 
{
    public static void main(String[] args) 
    {
        int arr[] = {4,3,2,7,8,2,3,1};

        System.out.println(disappeared(arr));

        
    }

    public static ArrayList<Integer> disappeared(int arr[])
    {
        int i=0;
        while(i<arr.length)
        {
            int correct = arr[i]-1;
            if(arr[i]>= 1 && arr[i]<=arr.length && arr[i] != arr[correct])
            {
                swap(arr, i, correct);
            }
            else
            {
                i++;
            }

        }

        ArrayList<Integer> result = new ArrayList<>();
        for(int index = 0;index<arr.length;index++)
        {
            if(arr[index] != index+1)
            {
                result.add(index+1);
            }

        }
        return result;


    }

    public static void swap(int arr[], int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
