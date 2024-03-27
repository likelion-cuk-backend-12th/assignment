package ex02;

public class hw_3 {
    public static void main(String[] args) {
        short s1 = 1;
        short s2 = 2;
        short s3 = (short) (s1 + s2);
        // ","로 연결 할거면 자료형을 생략해야하고, 아니면 행을 나눠 위와같이 행을 종료하고 새 행에 작성해야 한다
        // short 변수와 short 변수를 더하면 jvm의 연산단위에 의해 int로 바뀌어 연산 결과가 나오나 s3는 short 로 작성 되어 s3를 int 로 바꾸거나 short로 casting를 해줘야 한다.
    }
}
