public class SelectionSort 
{
   public static void main(String args[])
   {
      int arr[] = {54,32,12,34,1};

      int i;
      int j;
      for(i=0;i<arr.length;i++)
      {
         
         int mini = i;
         for(j=i+1;j<arr.length;j++)
         {
            if(arr[j]<arr[mini])
            {
               mini = j;
            }
         }

         int temp = arr[mini];
         arr[mini] = arr[i];
         arr[i]= temp;

      }

      for(int a : arr)
      {
         System.out.print(a+" ");
      }
   }
   
}
