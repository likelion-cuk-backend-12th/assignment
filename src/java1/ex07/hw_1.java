package src.java1.ex07;

public class hw_1 {
    public static int preIncrease(myInteger num) {//++b
        int val = num.getNum();
        num.setNum(val+1);
        return num.getNum();

    }

    public static int postIncrease(myInteger num) {//b++
        int val = num.getNum();
        num.setNum(val+1);
        return val;

    }

    // 실행 코드
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
}

class myInteger {
    private int num;

    public myInteger(){
        this.num = 0;
    }

    public void setNum(int num){
        this.num = num;
    }

    public int getNum(){
        return this.num;
    }

    @Override
    public String toString() {
        return Integer.toString(this.num);
    }
}
