package Practise;
import java.util.*;

public class ValidAnagram 
{
    public static void main(String[] args) 
    {
        String s = "atul";
        String t = "tula";

        char []ch1 = s.toCharArray();
        char []ch2 = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        

        if(Arrays.equals(ch1, ch2))
        {
            System.out.println("valid anagarm");
        }
        else
        {
            System.err.println("not an anagram");
        }



        
    }
    
}
