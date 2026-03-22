package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartioning
{
    public static void main(String[] args) 
    {
        String s = "aab";
        System.out.println(partition(s));
        System.out.println((char)10084);

        
    }

    public static List<List<String>> partition(String s)
    {
        List<List<String>> result = new ArrayList<>();
        List<String> current  = new ArrayList<>();
        backtrack(s, 0, current, result);
        return result;
    }

    private static void backtrack(String s, int start , List<String> current , List<List<String>> result )
    {
        if(start == s.length())
        {
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i= start;i<s.length();i++)
        {
            if(isPalindrome(s,start,i))
            {
                current.add(s.substring(start,i+1));
                backtrack(s, i+1, current, result);
                current.remove(current.size()-1);
            }
        }

    }

    private static Boolean isPalindrome(String s, int left,int right)
    {
        while(left<right)
        {
            if(s.charAt(left++) != s.charAt(right--))
            {
                return false;
            }
        }
        return true;
    }
}