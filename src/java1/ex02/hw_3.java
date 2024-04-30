package java1.ex02;

public class hw_3 {
    public static void main(String[] args) {
        //short s1= 1, short s2= 2, short s3 = s1+s2

        /*
            오류가 발생한다.
            코드 뒤에 세미콜론(;)이 빠졌으며,
            자동 형변환 규칙에 의해 s1+s2 연산 시에, int로 형변환 되기 때문이다.
            이를 다시 s3에 대입하려고 하면, 다운캐스팅 이므로
            int를 short로 명시적 형변환을 해주어야 한다.

        */

    }
}
