package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StockSpanProblem
{
    public static void main(String[] args) 
    {
        int arr[] = {100,80,60,70,60,75,85};

        System.out.println(spanner(arr));
        
    }

    public static List<Integer> spanner(int arr[])
    {
        int n = arr.length;
        int count  = 1;
        ArrayList<Integer> result = new ArrayList<>();

        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++)
        {
            if(st.isEmpty())
            {
                result.add(count);
            }
            else if(!st.isEmpty() && st.peek() >= arr[i])
            {
                while(!st.isEmpty() && st.peek() >= arr[i])
                {
                     result.add(count++); 
                }
                  
            }
            else if(!st.isEmpty() && st.peek() <=  arr[i])
            {
                result.add(count);
            }
        }

        return result;

    }


}