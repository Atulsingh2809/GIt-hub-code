package Practise;
import java.util.*;
public class matrixAdd 
{
    public static void main(String[] args) 
    {
        int arr1[][]={{2,4},{3,6}};
        int arr2[][]={{1,2},{4,3}};

        matrixAddition(arr1, arr2);
    }

    public static void matrixAddition(int arr1[][],int arr2[][])
    {
        int sum[][] = new int[2][2];
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                sum[i][j] = arr1[i][j]+arr2[i][j];
                System.out.println(sum[i][j]+" ");
                
            }
            System.out.println();
        }

    }
    

}
