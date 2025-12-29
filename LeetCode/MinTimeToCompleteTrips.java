package LeetCode;

public class MinTimeToCompleteTrips 
{
    public static void main(String[] args) 
    {
        int time[] = {1,2,3}; 
        int totalTrips = 5;

        int result = MinTime(time, totalTrips);
        System.out.println(result);
        
    }

    static int MinTime(int time[],int totalTrips)
    {
        int count = 1;

        while(totalTrips>0)
        {
            for(int i=0;i<time.length;i++)
            {
                totalTrips-=time[i];
                count++;
            }

        }
        return count+1;
        

    }
    
}
