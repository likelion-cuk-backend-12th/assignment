package src.java2.ex06;

public class Main {
    public static void main(String[] args) {
        LikeQueue q = new LikeQueue();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println("q.peek() = " + q.peek());

        q.dequeue();
        System.out.println("q.peek() = " + q.peek());
        q.dequeue();
        System.out.println("q.peek() = " + q.peek());
        q.dequeue();
        System.out.println("q.peek() = " + q.peek());
        q.dequeue();
        System.out.println("q.peek() = " + q.peek());
        q.dequeue();
        System.out.println("q.peek() = " + q.peek());

        q.dequeue();
        System.out.println("q.peek() = " + q.peek());

    }
}
