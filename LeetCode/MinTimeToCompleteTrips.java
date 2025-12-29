package LeetCode;

public class MinTimeToCompleteTrips 
{
   
    public static void main(String[] args) 
    {
        int[] time = {1, 2, 3};
        int totalTrips = 5;

        long result = minTime(time, totalTrips);
        System.out.println(result);
    }

    static long minTime(int[] time, int totalTrips)
    {
        // Find the minimum time taken by a single bus
        int minTime = Integer.MAX_VALUE;
        for (int t : time)
        {
            minTime = Math.min(minTime, t);
        }

        long start = 1;
        long end = (long) minTime * totalTrips;

        while (start < end)
        {
            long mid = start + (end - start) / 2;

            if (canCompleteTrips(time, mid, totalTrips))
            {
                end = mid;
            }
            else
            {
                start = mid + 1;
            }
        }
        return start;
    }

    static boolean canCompleteTrips(int[] time, long currentTime, int totalTrips)
    {
        long trips = 0;

        for (int t : time)
        {
            trips += currentTime / t;
            if (trips >= totalTrips)
            {
                return true;
            }
        }
        return false;
    }
}

