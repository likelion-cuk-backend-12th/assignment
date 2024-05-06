package java3.ex02;

class MyInteger {
    private int num;

    MyInteger(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

public class IntWithInteger {


    public static void int_42(int num){
        num *= 42;
        System.out.println("method num1: " + num);
        // 메서드 안에서만 값이 변경되므로, 메서드의 반환형이 void인 이상 변경할 수 없다.
    }

    public static void Integer_42(Integer num){
        num = 42;
        System.out.println("method num2: " + num);
        // Integer는 불변 객체이므로, 값을 변경할 수 없다.
        // 이 경우에 num은 기존 값이 변경된 것이 아니라 새로 int형 42를 만들어서 가르키는 것이다.
    }

    public static void MyInteger_42(MyInteger num){
        num.setNum(num.getNum()/42);
    }
    public static void main(String[] args) {

        int num1 = 10;
        Integer num2 = Integer.valueOf(20);
        MyInteger num3 = new MyInteger(42);

        int_42(num1);
        Integer_42(num2);
        MyInteger_42(num3);

        System.out.println("main num1: " + num1);
        System.out.println("main num2: " + num2);
        System.out.println("main num3: " + num3.getNum());
    }
}
