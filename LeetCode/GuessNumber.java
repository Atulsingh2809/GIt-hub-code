package LeetCode;

import java.util.Scanner;

public class GuessNumber {

    static int secret = 6;

    public static void main(String[] args) 
    {
        System.out.println("enter a no :");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(guessNumber(n));
    }

    static int guessNumber(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int g = guess(mid);

            if (g == 0) {
                return mid;
            } else if (g == -1) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int guess(int num) {
        if (num == secret) return 0;
        if (num > secret) return -1;
        return 1;
    }
}
