package java1.bonus00;

public class bonus01 {
    public static int findLSL(String str) {
        char[] arr = str.toCharArray();
        int highest = 1;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    count++;
            }
            if(count > highest)
                highest = count;
        }
        return highest;
    }

    public static void main(String[] args) {
        String str = "aabbcccd";
        System.out.println(findLSL(str));
    }
}
