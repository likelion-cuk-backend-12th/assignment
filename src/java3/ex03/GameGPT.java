package java3.ex03;

import java.util.Random;

public class GameGPT implements GPT{
    @Override
    public  String hello(String name){
        return "Hello, " + name + "! I'm GameGPT";
    }


    void rockScissorsPaper(String input){

        Random random = new Random();
        int randomNum = random.nextInt(3);

        String computer;

        if (randomNum == 0){
            computer = "rook";
        } else if (randomNum == 1){
            computer = "scissors";
        } else {
            computer = "paper";
        }


        if (input.equals(computer)) {
            System.out.println("비겼습니다.");
        } else if ((input.equals("rook") && computer.equals("scissors")) ||
                (input.equals("scissors") && computer.equals("rook")) ||
                (input.equals("paper") && computer.equals("scissors"))) {

            System.out.println("졌습니다.");
        } else {
            System.out.println("이겼습니다.");
        }


    }

}
