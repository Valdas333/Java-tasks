public class RecursiveBinarySearch {

    public static int RecursiveBinarySearch(int[] array, int target) {
        return RecursiveBinarySearch(array, target, 0, array.length - 1);
    }

    private static int RecursiveBinarySearch(int[] array, int target, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                return RecursiveBinarySearch(array, target, mid + 1, right);
            } else {
                return RecursiveBinarySearch(array, target, left, mid - 1);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        int target = 7;

        int result = RecursiveBinarySearch(sortedArray, target);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}

