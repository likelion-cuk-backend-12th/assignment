package JAVA2.ex06;
public class LikeQueue {
    private LikeList list;

    public LikeQueue() {
        this.list = new LikeList();
    }

    public void enqueue(int value) {
        list.addLast(value);
    }

    public void dequeue() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        list.removeFirst();
    }

    public int peek() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}

