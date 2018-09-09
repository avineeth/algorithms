/**
 * Easiest way to find a key in a Array.
 * Pre-condition - Array has to be sorted.
 * Complexity - logN
 *
 * Highlevel logic:
 *   Compare key against middle entry.
 *   Too small, go left.
 *   Too big, go right.
 *   Equal, found.
 *   To remember : use while loop.
 *      mid = lo + (hi-lo)/2;
*/
public class BinarySearch {

    public static void main(String args[]) {
        System.out.println("Hello World");

        int[] arr = new int[]{1, 3, 5, 6, 9, 11, 12};
        int target = 1;
        System.out.println("Target At=" + binarySearch(arr, target));

    }

    public static int binarySearch(int[] arr, int target) {

        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            System.out.println("lo=" + lo + " hi=" + hi + " mid=" + mid);

            if (arr[mid] > target) { //in first half
                hi = mid - 1;
            } else if (arr[mid] < target) { // in second half
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
