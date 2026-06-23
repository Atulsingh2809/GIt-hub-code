package Practise;

class ThirdMaximum
{
    public static void main(String[] args) 
    {
        int arr[] = {2,2,1,3};

        System.out.println(ThirdMax(arr));
        

    }

    static int ThirdMax(int arr[])
    {

        long v1 = Long.MIN_VALUE;
        long v2 = Long.MIN_VALUE;
        long v3 = Long.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == v1|| arr[i] == v2 || arr[i] == v3)
            {
                continue;
            }

            if(arr[i]>v1)
            {
                v3 = v2;
                v2 = v1;
                v1 = arr[i];
            }
            else if(arr[i]>v2)
            {
                v3 = v2;
                v2 = arr[i];
            }
            else if(arr[i]>v3)
            {
                v3 = arr[i];
            }


        }
        return (v3 == Long.MIN_VALUE) ? (int)v1 : (int)v3;
    }
}