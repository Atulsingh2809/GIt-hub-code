package Practise;
import java.util.*;

public class Anagram 
{
    public static void main(String[] args) 
    {
        String s1 = "doga";
        String s2 = "god";

        char ch1[] =  s1.toCharArray();
        char ch2[] = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.equals(ch1, ch2)?"anagram":"not anagram");
         
    }
    
}
