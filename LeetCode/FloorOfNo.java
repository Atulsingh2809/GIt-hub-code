package LeetCode;



public class FloorOfNo {

    public static void main(String[] args) {

        int[] arr = {12, 23, 33, 45, 5, 67, 68, 234};
        int target = 230;




        int result = floor(arr, target);

        if (result == -1) {
            System.out.println("Floor doesn't exist");
        } else {
            System.out.println("Floor value is: " + result);
        }
    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

      
        if (target < arr[0]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }

      
        return end;
    }
}
