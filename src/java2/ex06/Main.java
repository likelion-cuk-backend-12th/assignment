package java2.ex06;

public class Main {
    public static void main(String[] args) {
        LikeQueue q = new LikeQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.dequeue();
        System.out.println(q.isEmpty());
    }
}
