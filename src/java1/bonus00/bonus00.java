package java1.bonus00;

public class bonus00 {
    public static void convertThreeBase(int num) {
        String str = "";
        while (num != 0) {
            str += Integer.toString(num % 3);
            num /= 3;
        }

        String a = new StringBuilder(str).reverse().toString();
        System.out.println(a);
    }

    public static void convertFiveBase(int num) {
        String str = "";
        while (num != 0) {
            str += Integer.toString(num % 5);
            num /= 5;
        }

        String a = new StringBuilder(str).reverse().toString();
        System.out.println(a);
    }

    public static void convertThirteen(int num) {
        String str = "";
        while (num != 0) {
            if (num % 13 == 12) str += "C";
            else if (num % 13 == 11) str += "B";
            else if (num % 13 == 10) str += "A";
            else {
                str += Integer.toString(num % 13);
            }
            num /= 13;
        }

        String a = new StringBuilder(str).reverse().toString();
        System.out.println(a);
    }


    public static void main(String[] args) {
        int num = 23;
        convertThirteen(num);
        convertFiveBase(num);
        convertThreeBase(num);
    }
}
