package JAVA1.ex07;

public class hw_1 {
    public static void main(String[] args) {
        int a = 0;
        myInteger b = new myInteger();

        System.out.println(a++);
        System.out.println(postIncrease(b));
        System.out.println("a: " + a + " b:" + b);
        System.out.println("-----");

        System.out.println(++a);
        System.out.println(preIncrease(b));
        System.out.println("a: " + a + " b:" + b);
        System.out.println("-----");

        System.out.println(a++ + a++);
        System.out.println(postIncrease(b) + postIncrease(b));
        System.out.println("a: " + a + " b:" + b);
        System.out.println("-----");

        System.out.println(++a + ++a);
        System.out.println(preIncrease(b) + preIncrease(b));
        System.out.println("a: " + a + " b:" + b);
        System.out.println("-----");
    }

    static class myInteger {
        int num;

        public myInteger() {
            this.num = 0;
        }
    }

    // 전위 증가 연산자 함수
    public static int preIncrease(myInteger num) {
        return ++num.num;
    }

    // 후위 증가 연산자 함수
    public static int postIncrease(myInteger num) {
        int temp = num.num;
        num.num++;
        return temp;
    }
}
