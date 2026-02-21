package LeetCode;

public class BinarySearchRecursion 
{
    public static void main(String[] args) 
    {
        int arr[] = {12, 23, 34, 45, 65};
        int start = 0;
        int end = arr.length - 1;
        int key = 45;

        int result = RBS(arr, start, end, key);

        if(result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }

    static int RBS(int arr[], int start, int end, int key)
    {
        if(start > end)
        {
            return -1;
        }

        int mid = start + (end - start) / 2;


        if(key == arr[mid])
        {
            return mid;
        }
        else if(key < arr[mid])
        {
            return RBS(arr, start, mid - 1, key);
        }
        else
        {
            return RBS(arr, mid + 1, end, key);
        }
    }
}