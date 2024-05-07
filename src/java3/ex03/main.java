package java3.ex03;

public class main {
    public static void main(String[] args) {

        ChatGPT chatGPT = new ChatGPT();
        GameGPT gameGPT = new GameGPT();
        CodingGPT codingGPT = new CodingGPT();

        chatGPT.hello("Chae eun");
        codingGPT.algorithm("알고리즘");
        gameGPT.rockScissorsPaper("rook");

    }
}
