package Practise;
import java.util.*;

public class SundayCount 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        String day = sc.nextLine();
        int days = sc.nextInt();

        HashMap<String,Integer> mp = new HashMap<>();
        mp.put("sun", 0);
        mp.put("mon", 1);
        mp.put("tue", 2);
        mp.put("wed", 3);
        mp.put("thu", 4);
        mp.put("fri", 5);
        mp.put("sat", 6);

        int start = mp.get(day.substring(0, 3));
        int firstSunday = (7-start)%7;
        int ans = 0;

        if(firstSunday<days)
        {
            ans = 1+(days-firstSunday-1)/7;
        }

        System.out.println(ans);


        
    }
}
