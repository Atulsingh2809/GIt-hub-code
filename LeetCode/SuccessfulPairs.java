package LeetCode;

public class SuccessfulPairs 
{
    public static void main(String[] args) 
    {
        int spells[] = {5, 1, 3};
        int potions[] = {1, 2, 3, 4, 5};
        int pass = 7;

        int[] result = Success(spells, potions, pass);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }

    static int[] Success(int spells[], int potions[], int pass)
    {
        int[] result = new int[spells.length];

        for (int i = 0; i < spells.length; i++)
        {
            int count = 0;

            for (int j = 0; j < potions.length; j++)
            {
                if ((long) spells[i] * potions[j] >= pass)
                {
                    count++;
                }
            }

            result[i] = count;
        }

        return result;
    }
}
    