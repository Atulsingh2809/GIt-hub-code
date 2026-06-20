package Practise;

public class removeChar
{
    public static void main(String[] args) 
    {
        String str1 = "computer";
        String str2 = "cat";

        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        for(char i=0;i<ch2.length;i++)
        {
            for(char j=0;j<ch1.length;j++)
            {
                if(ch1[j] != ch2[i])
                {
                    str1.replace(ch1[j], );
                }
            }

        }


    
    }
}