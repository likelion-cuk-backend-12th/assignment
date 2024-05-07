package java3.ex03;
import java.util.Random;

public class ChatGPT implements GPT{

    @Override
    public  String hello(String name){
        return "Hello, " + name + "! I'm ChatGPT";
    }
}
