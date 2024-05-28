package JAVA3.ex02;

public class IntWithInteger {

    public static class MyInteger {
        private int value;

        public MyInteger(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    public static void multiplyBy42(int num) {
        num *= 42;
        System.out.println("multiplyBy42 결과: " + num);
    }

    public static void setTo42(Integer num) {
        num = 42;
        System.out.println("setTo42 결과: " + num);
    }

    public static void divideBy42(MyInteger myInt) {
        myInt.setValue(myInt.getValue() / 42);
        System.out.println("divideBy42 결과: " + myInt.getValue());
    }

    public static void main(String[] args) {
        int primitiveInt = 10;
        Integer integerObject = 10;
        MyInteger myIntegerObject = new MyInteger(84);

        System.out.println("원래 primitiveInt 값: " + primitiveInt);
        multiplyBy42(primitiveInt);
        System.out.println("메소드 호출 후 primitiveInt 값: " + primitiveInt);

        System.out.println("원래 integerObject 값: " + integerObject);
        setTo42(integerObject);
        System.out.println("메소드 호출 후 integerObject 값: " + integerObject);

        System.out.println("원래 myIntegerObject 값: " + myIntegerObject.getValue());
        divideBy42(myIntegerObject);
        System.out.println("메소드 호출 후 myIntegerObject 값: " + myIntegerObject.getValue());
    }
}