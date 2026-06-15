package Practise;

import java.util.*;

public class LargestRectangleHistogram 
{
    public static void main(String[] args) 
    {
        int heigths[]  = {2,1,5,6,2,3};

        System.out.println(largestRectangle(heigths));

    }

    static int largestRectangle(int heights[])
    {
        int n = heights.length;

        int left[] = new int[n];
        int right[] = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++)     // left side
        {
            while(!st.isEmpty() && heights[st.peek()] > heights[i])
            {
                st.pop();
            }
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        for(int i=n-1;i>=0;i--)        // rigth side
        {
            while(!st.isEmpty() && heights[st.peek()] > heights[i])
            {
                st.pop();
            }
            right[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i); 
        }

        int maxArea = 0;

        for(int i=0;i<n;i++)
        {
            int width  = right[i]-left[i]-1;
            int area =  heights[i]*width;

            maxArea  = Math.max(area, maxArea);
        }

        return maxArea;

    }
    
}
