package Practise;

import java.util.*;

public class coolingChef {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int sum = 0;

            for (int k = X; k > Y; k--) {
                sum += (k + 9) / 10;   // ceil(k/10)
            }

            System.out.println(sum);
        }

        sc.close();
    }
}