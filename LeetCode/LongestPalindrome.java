package LeetCode;

public class LongestPalindrome
{
    public static void main(String[] args) 
    {
        String s = "babad";
        System.out.println(LongPalindrome(s));
        
        
    }

    public static Boolean solve(String s, int i, int j)
    {
        if(i>=j)
        {
            return true;
        }

        if(s.charAt(i) == s.charAt(j))
        {
            return solve(s, i+1, j-1);
        }
        else
        {
            return false;
        } 
    }

    public static String LongPalindrome(String s)
    {
        int n = s.length();
        int maxlen = Integer.MIN_VALUE;
        int sp = 0;

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(solve(s,i,j))
                {
                    if(j-i+1 > maxlen)
                    {
                        maxlen  = j-i+1;
                        sp = i;
                    }
                }
            }
        }
        return s.substring(sp, sp+maxlen);
    }

}