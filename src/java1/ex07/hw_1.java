package java1.ex07;

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

    public static int preIncrease(myInteger num) {
        int prenum= ++num.num;
        return prenum;
    }
    public static int postIncrease(myInteger num) {
        int postnum= num.num++;
        return postnum;
    }
}

class myInteger {
    int num = 0;
    public String toString(){
        return Integer.toString(num);
        //모든 클래스는 'Object'클래스를 상속받기 때문에 오버라이드할 수 있음!
        //toString는 객체를 원하는 형식으로 출력하도록 지정할 수 있음
    }
}
