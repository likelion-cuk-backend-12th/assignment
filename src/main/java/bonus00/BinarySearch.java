package bonus00;

public class BinarySearch {
    public static int binarySearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (array[mid] == target) {
            return mid;
        } else if (array[mid] < target) {
            return binarySearch(array, target, mid + 1, right);
        } else {
            return binarySearch(array, target, left, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int result = binarySearch(array, target, 0, array.length - 1);
        System.out.println(result);
    }
}
