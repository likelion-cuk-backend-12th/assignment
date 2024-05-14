package java3.ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Student {



    public class Main {

        public static void main(String[] args) {
            try { // 예외처리
                File file = new File("\"C:\\Users\\codms\\Desktop\\LikeLion\\강의시간표.txt\""); // 읽을 파일 경로
                Scanner scanner = new Scanner(file);

                // 파일 내용을 한 줄씩 읽어옴
                while (scanner.hasNextLine()) {
                    String data = scanner.nextLine();


                }

                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("파일을 찾을 수 없습니다: " + e.getMessage());
            }
        }
    }



}
