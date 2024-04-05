package ex05;

import ex04.LikeList;

public class LikeStack {
    private LikeList list;

    public LikeStack() {
        list = new LikeList();
    }

    public void push(int value) {
        list.insert(0, value);
    }

    public void pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        list.delete(0);
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
}