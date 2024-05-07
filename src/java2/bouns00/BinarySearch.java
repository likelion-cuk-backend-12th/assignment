package java2.bouns00;

public class BinarySearch {

    public static void main(String[] args) {
        int[] a={1, 2, 3, 4, 5};
        int result = binarySearch(a, 2, 0, a.length-1);

        if(result == -1)    System.out.println("값을 찾지 못했습니다.");
        else System.out.println("인덱스는 "+result);

    }
    public static int binarySearch(int[] array, int target, int left, int right) {
        //int i=left;
        int result;

        if(left<=right){
            result=left+right/2;

            if(array[result]==target) return result;
            else if (target<array[result]) {
                return binarySearch(array, target, left, result-1);
            }else{
                return binarySearch(array, target, result+1, right);
            }
        }
        return -1;

    }

}
