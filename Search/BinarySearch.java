package Search;

public class BinarySearch 
{
     public static void main (String args[])
     {

         int arr[] = {12,23,34,45,56};
         int target  = 56;

         System.out.println(BS(arr,target));
     }


     static int BS(int arr[], int target )
     {
       
         int start = 0;
         int end = arr.length-1;

         while(start <= end)
         {

            int mid = start + (end-start)/2;

            if(target < arr[mid])
            {
               end = mid-1;
            }
            else if(target > arr[mid])
            {
               start = mid+1;
            }
            else
            {
               return mid;
            }
         }

         return -1;
     }
     
   
}



