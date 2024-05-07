package src.java2.ex06;

public class LikeQueue {

    // ex04에서 만든 LikeList 사용
    private LikeList list = new LikeList();

    static int front = 0;
    static int rear = 0;

    // 추가
    public void enqueue(int value) {
        list.insert(rear,value);
        rear++;
    }
    // 삭제
    public void dequeue() {
        //System.out.println("\nfront: " + front + " rear: " + rear);
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return;
        }
        list.delete(front);
        front++;
    }
    // 큐의 첫번쨰 값 조회
    public int peek() {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return 0;
        }
        list.print();
        return list.print(front);
    }
    // 큐가 비었는지 확인
    public boolean isEmpty() {
        if(rear == front)
            return true;
        else
            return false;
    }
}
