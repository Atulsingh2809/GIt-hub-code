public class SelectionSort 
{
   public static void main(String args[])
   {
      int arr[] = {54,32,12,34,1};

      int i;
      int j;
      for(i=0;i<arr.length-1;i++)
      {
         
         int mini = i;
         for(j=i+1;j<arr.length-1;j++)
         {
            if(arr[j]<arr[mini])
            {
               mini = j;
            }
         }

         int temp = arr[mini];
         arr[mini] = arr[i];
         arr[i]= temp;

         System.out.print(arr[i]+",");
      }

   }
   
}
