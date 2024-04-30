package java2.ex06;

import java2.ex04.LikeList;

public class LikeQueue {

    private LikeList list;

    public void enqueue(int value) {
        list.insert(0, value);
    }

    public void dequeue() {
        list.delete(list.getSize() - 1);
    }

    public int peek() {
        return list.get(list.getSize() - 1);
    }

    public boolean isEmpty() {
        if (list.getSize() == 0)
            return true;
        return false;
    }
}
