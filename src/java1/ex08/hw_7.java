package ex08;

import java.util.Scanner;

public class hw_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        String binaryString = convertToBinary(num);
        System.out.println(binaryString);

    }


    public static String convertToBinary(int number) {
        StringBuilder binary = new StringBuilder();

         while (number > 0) {
            binary.insert(0, number % 2);
            number /= 2;
        }

        if (binary.length() == 0) {
            return "0";
        }

        return binary.toString();
    }
}

