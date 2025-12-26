package LeetCode;

public class SingleElementSortedArray 
{
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,4,8,8};
    int left=SingleElement(arr);
    int right= SingleElement2(arr);
    if(left!=-1){
        System.out.println(left);
    }else{
        System.out.println(right);
    }

    }

    static int SingleElement(int arr[])
    {
        int start = 0;
        int end  =arr.length-1;

        while(start <= end)
        {
            int mid = start+(end-start)/2;

            if(mid>start && arr[mid] == arr[mid-1])
            {   System.out.println("left:"+end);
                end= mid-2;
            }
            if((mid<end && arr[mid]<arr[mid+1]) && (arr[mid]>arr[mid-1] && start>mid))
            {
                return mid;
            }else if(start>mid){
                System.out.println("left:"+end);
                end=mid-1;
            }

        }
        return -1;

    }

    static int SingleElement2(int arr[])
    {
        int start = 0;
        int end  =arr.length-1;

        while(start <= end)
        {
            int mid = start+(end-start)/2;

            if(mid>end && arr[mid] == arr[mid+1])
            {  System.out.println("Right:"+start);
                start= mid+2;
            }
            if((mid<=end && arr[mid]<arr[mid+1]) && (arr[mid]>arr[mid-1] && start>=mid))
            {
                return mid;
            }else if(end>mid){
                 System.out.println("Right:"+start);
                start=mid+1;
            }


        }
        return -1;

    }
    
}
