package java4.ex02;

public class SuperLevel extends BoardLevel {

    @Override
    public void jump() {
        System.out.println("아주 높이 jump 합니다.");
    }
    @Override
    public void run() {
        System.out.println("엄청 빨리 달립니다.");
    }

    @Override
    public void turn() {
        System.out.println("한 바퀴 돕니다.");
    }
}
