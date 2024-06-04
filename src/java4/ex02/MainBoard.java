package java4.ex02;
public class MainBoard {
    public static void main(String[] args) {
            Player player = new Player();
            player.play(1);
            player.setLevel(new AdvancedLevel());
            player.play(2);
            player.setLevel(new SuperLevel());
            player.play(3);
    }
}
