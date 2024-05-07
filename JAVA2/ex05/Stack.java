package JAVA2.ex05;

public class Stack<T> {
    private LikeList<T> list;

    public Stack() {
        this.list = new LikeList<>();
    }

    public void push(T data) {
        list.addFirst(data);
    }

    public T pop() {
        return list.removeFirst();
    }

    public T peek() {
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}
