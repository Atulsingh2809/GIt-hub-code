package Practise;

public class ValidPalindrome 
{
    public static void main(String[] args) 
    {
        String s = "A man, a plan, a canal: Panama";

        System.out.println(valid(s));

        
    }

    static boolean valid(String s)
    {
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch))
            {
                sb.append(Character.toLowerCase(ch));
            }
        }

        String original = sb.toString();
        String changed = sb.reverse().toString();

        return original.equals(changed);
    }
    
}
