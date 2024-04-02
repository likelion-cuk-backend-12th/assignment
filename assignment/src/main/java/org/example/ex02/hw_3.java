package java1.ex02;

public class hw_3 {
    public static void main(String[] args) {
        short s1 = 1;
        short s2 = 2;
        short s3 = (short)(s1 + s2);
        /* 이유 - Cast expression to 'short'
            short가 표현할 수 있는 범위를 벗어났기때문에
            명시적 형변환이 필요하다.
            (short형은 int형보다 표현 범위가 작기 때문에
            숫자가 손실되는 문제가 발생할 수 있음.)
         */
    }
}
