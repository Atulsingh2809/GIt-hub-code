package LeetCode;

public class RemoveParticularFromString 
{
    public static void main(String[] args) 
    {
        String str1 = "baccad";
        
        String rs = doFilter(str1);
        System.out.println(rs);

        

        
    }

    public static String doFilter(String str1)
    {
        String ans = "";
        char arr[] = str1.toCharArray();

        for(int i=0;i<arr.length;i++)
        {
            if(str1.charAt(i) == 'a')
            {
                continue;
            }
            else
            {
                ans +=str1.charAt(i);
            }
        }
        return ans;

    }


    
}
