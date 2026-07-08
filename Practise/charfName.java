package Practise;

import java.util.*;

class chefName
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
		String str = sc.next();
		 
		 int n = str.length();
		
		for(int i=0;i<n;i++)
		{
		    if(str.charAt(0) == 'c' || str.charAt(n-1) == 'f' || (str.charAt(0) == 'c' && str.charAt(n-1) == 'f' ))
		    {
		        System.out.println("Yes");
				break;
		    }
			else
			{
				System.out.println("No");
				break;
			}
		}
		
    }
}