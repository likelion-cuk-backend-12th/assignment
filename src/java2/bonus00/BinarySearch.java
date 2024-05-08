package src.java2.bonus00;

public class BinarySearch {
    public static int binarySearch(int[] array, int target, int left, int right){
        //System.out.println("[" + left + " , " + right + "]");
        int center = left + ((right - left)/2);
        int result = 0;

        if(left > right)
            return -1;

        //System.out.println("idx: " + center +" center = " + array[center]);
        if(array[center] == target)
            return center;
        else if(center == 0){
            return -1;
        }


        if(array[center] > target){
            //left
            result = binarySearch(array, target, left, center);
        }
        else{
            //right
            result = binarySearch(array, target, center+1, right);
        }
        return result;
    }
    public static void main(String[] args) {
        //          0  1  2  3  4  5  6  7  8   9
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(binarySearch(arr,1, 0, arr.length-1));
        System.out.println(binarySearch(arr,2, 0, arr.length-1));
        System.out.println(binarySearch(arr,3, 0, arr.length-1));
        System.out.println(binarySearch(arr,4, 0, arr.length-1));
        System.out.println(binarySearch(arr,5, 0, arr.length-1));
        System.out.println(binarySearch(arr,6, 0, arr.length-1));
        System.out.println(binarySearch(arr,7, 0, arr.length-1));
        System.out.println(binarySearch(arr,8, 0, arr.length-1));
        System.out.println(binarySearch(arr,9, 0, arr.length-1));
        System.out.println(binarySearch(arr,10, 0, arr.length-1));
        System.out.println();
        System.out.println(binarySearch(arr,0, 0, arr.length-1));
        System.out.println(binarySearch(arr,11, 0, arr.length-1));
    }
}
