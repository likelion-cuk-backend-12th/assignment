package ex05;

public class hw_4 {
    public static void main(String[] args) {
        int month;
        int day;

        month = 2;
        day = 15;
        if((month == 2)&(day >= 29))
            System.out.println("윤년입니다.");
        else
            System.out.println("윤년이 아닙니다.");

    }
}
