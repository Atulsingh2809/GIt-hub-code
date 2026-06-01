package Practise;

public class BuyAndSellStock 
{
    public static void main(String[] args) 
    {
        int arr[] = {7,1,5,3,6,4};

        int minPrices = Integer.MAX_VALUE;
        int maxProfit  = 0;

        for(int i=0;i<arr.length;i++)
        {
            minPrices = Math.min(minPrices,arr[i]);
            maxProfit  = Math.max(maxProfit, arr[i]-minPrices);

        }

        System.out.println(maxProfit);
        
    }

    
}
