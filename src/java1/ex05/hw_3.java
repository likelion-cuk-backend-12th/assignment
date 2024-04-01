package java1.ex05;

//int형 변수 score를 선언하고, 값이 90 이상인 경우 "A", 80 이상인 경우 "B", 70 이상인 경우 "C", 그 외에는 "D"라는 학점을 출력하는 프로그램을 작성하세요.
public class hw_3 {
    public static void main(String[] args) {
        int score = 85;
        switch (score / 10) {
            case 10, 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            default:
                System.out.println("D");
                break;
        }
    }
}
