package src.java2.ex05;

public class Main {
    public static void main(String[] args) {
        LikeStack stack = new LikeStack();

        stack.push(1);
        System.out.println("peek " + stack.top + ": " + stack.peek() +"\n");
        stack.push(2);
        System.out.println("peek " + stack.top + ": " + stack.peek() +"\n");
        stack.push(3);
        System.out.println("peek " + stack.top + ": " + stack.peek() +"\n");
        stack.push(4);
        System.out.println("peek " + stack.top + ": " + stack.peek() +"\n");

        stack.pop();
        System.out.println("peek " + stack.top + ": " + stack.peek() +"\n");
        stack.pop();
        System.out.println("peek " + stack.top + ": " + stack.peek() +"\n");
        stack.pop();
        System.out.println("peek " + stack.top + ": " + stack.peek() +"\n");
        stack.pop();
        System.out.println("peek " + stack.top + ": " + stack.peek() +"\n");
        stack.pop();
        System.out.println("peek " + stack.top + ": " + stack.peek() +"\n");
    }
}
