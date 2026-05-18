package Practise;

public class LinearSearch 
{
    public static void main(String[] args) 
    {
        int arr[]= {5,4,2,1};
        int target = 3;

        System.out.println(LS(arr, target));
        
    }

    public static int LS(int arr[],int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(target == arr[i])
            {
                return arr[i];
            }
        }
        return -1;

    }
    
}
