package LeetCode;

public class TryLP 
{
    public static void main(String[] args) {
        
    }

    public static String LongestPalindrome(String s)
    {
        int n = s.length();
        int minlen = Integer.MAX_VALUE;
        int sp = 0;

        

    }
    public static Boolean solve(String s, int i ,int j)
    {
        i=0;
        j =s.length()-1;

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
            i++;
            j--;
        }
    }
    
}
