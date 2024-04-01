package org.example.ex07;

public class hw_1 {
        static class myInteger {
            int num = 0;

            public myInteger(int num) {
                this.num = num;
            }
        }

        public static int preIncrease(myInteger num) {
            num.num = num.num + 1;
            return num.num;
        }

        public static int postIncrease(myInteger num) {
            num.num = num.num + 1;
            return num.num - 1;
        }

        public static void main(String[] args) {
            int a = 0;
            myInteger b = new myInteger(0);

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
