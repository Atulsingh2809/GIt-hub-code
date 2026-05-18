package Practise;

import java.util.Scanner;

public class secondLargest
{
    public static void main(String[] args) 
    {
        int arr[] = {5,4,1,2,3};
        System.out.println("enter a set of numbers : ");
        for(int i=0;i<arr.length;i++)
        {
            Scanner scan = new Scanner(System.in);
            arr[i] = scan.nextInt();
        }
           System.out.println(SecLargest(arr));
       
        
    }

    public static int SecLargest(int arr[])
    {
        int max=0;
        int smax=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                smax= max;
                max= arr[i];
            }
            else if(arr[i]>smax && arr[i]!= max)
            {
                smax = arr[i];
            }
        }
        if(smax== 0)
        return -1;
        return smax;

    }

    

    
}