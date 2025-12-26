package Search;

public class linearSearch {
    public static void main(String[] args) {
        int arr[] = {12, 23, 34, 45, 56};
        int target = 56;

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                System.out.println("Target found at index " + i);
                return; // stop after finding
            }
        }

        System.out.println("Target not found");
    }
}
