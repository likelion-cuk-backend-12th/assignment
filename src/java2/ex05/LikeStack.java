package java2.ex05;

import java2.ex04.LikeList;

public class LikeStack {

    private LikeList list;

    public void push(int value) {
        list.insert(0, value);
    }

    public void pop() {
        list.delete(0);
    }

    public int peek() {
        return list.get(0);
    }

    public boolean isEmpty() {
        if (list.getSize() == 0)
            return true;
        return false;
    }
}