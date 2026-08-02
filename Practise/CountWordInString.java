package Practise;

public class CountWordInString 
{
    public static void main(String[] args) 
    {
       String str = "I LOVE JAVA";
       
        if(str.isEmpty())
        {
            System.out.println(0);
        }
        else
        {
            String words[] = str.split("\\s+");
            System.out.println(words.length);
            
        }
        

    }
    
}
