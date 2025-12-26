package LeetCode;

class SmallestLetterGreaterThanTarget
{
    public static void main(String[] args) 
    {
        char ch[] = {'a','b','c','d','e','f'};
        char target = 'e';

        char ans  = Celichar(ch, target);
        System.out.println(ans);
        
    }

    static char Celichar(char[]ch, char target)
    {
        int start = 0;
        int end = ch.length-1;


        while(start <= end)
        {
            int mid = start +(end-start)/2;

            if(target < ch[mid])
            {
                end = mid-1;
            }
            else 
            {
                start = mid+1;
            }
        }

        return ch[start % ch.length];

    }
}
