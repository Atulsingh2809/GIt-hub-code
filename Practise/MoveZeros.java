package Practise;

import java.util.Arrays;

public class MoveZeros 
{
    public static void main(String[] args) 
    {
        int arr[] = {0,1,0,3,12};

        System.out.println(Arrays.toString(move(arr)));
    }
    
    public static int[] move(int arr[])
    {
        int n = arr.length;
        int ans[] = new int[n];

        int j = 0;

        for(int i = 0; i < n; i++)
        {
            if(arr[i] != 0)
            {
                ans[j] = arr[i];
                j++;
            }
        }

        return ans;
    }
}