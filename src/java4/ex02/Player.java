package java4.ex02;

public class Player {

    private BoardLevel level = null;

    public Player() {
        level = new BeginnerLevel();
    }

    public void play(int time) {
        level.run();
        for (int i = 0; i < time; i++) {
            level.jump();
        }
        level.turn();
    }

    public BoardLevel getLevel() {
        return level;
    }

    public void setLevel(BoardLevel level) {
        this.level = level;
    }
}