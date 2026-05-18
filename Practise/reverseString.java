package Practise;

public class reverseString 
{
    public static void main(String[] args) 
    {
       String str = "garima";
       
       reverse(str);
    }

    public static void reverse(String str)
    {
        String rev = "";
        int n =str.length();
        for(int i=n-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
        System.out.println(rev);
    }
    
}
