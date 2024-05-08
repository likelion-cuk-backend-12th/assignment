package ex06;

import ex04.LikeList;

public class LikeQueue {
    private LikeList list;

    public LikeQueue() {
        list = new LikeList();
    }

    public void enqueue(int value) {
        list.insert(list.size(), value);
    }

    public void dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        list.delete(0);
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
}