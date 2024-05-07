package java3.ex03;

public class CodingGPT implements GPT{

    @Override
    public  String hello(String name){
        return "Hello, " + name + "! I'm CodingGPT";
    }
    String algorithm(String input) {
        return "Implemented algorithm based on input: " + input;
    }
}
