public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        // Add your solution

        int left = 0;
        int right = data.length -1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (target < data[middle]) {
                right = middle - 1;
            }
            else if (target > data[middle]) {
                left = middle + 1;
            }
            else {
                return middle;
            }
        }
        // commit test
        return -1; // Place holder
    }
}
