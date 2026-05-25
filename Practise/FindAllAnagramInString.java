package Practise;

import java.util.*;

public class FindAllAnagramInString 
{
    public static void main(String[] args) 
    {
        String s = "abcdefghbcalm";
        String p = "abc";

        System.out.println(anagram(s, p));
        
    }

    public static List<Integer> anagram(String s, String p)
    {
         int sCount[] = new int[26];
         int pCount[] = new int[26];

         ArrayList<Integer> ans = new ArrayList<>();

         for(char c : p.toCharArray())
         {
            pCount[c-'a']++;
         }

         for(int i=0;i<s.length();i++)
         {
            sCount[s.charAt(i)-'a']++;


            if(i>=p.length())
            {
                sCount[s.charAt(i-p.length()) - 'a']--;
            }

            if(Arrays.equals(pCount,sCount))
            {
                ans.add(i-p.length()+1);
            }
         }
         return ans;

    }
    
}
