package java2.ex6;
import java2.ex04.*;
public class LikeQueue {

    // ex04에서 만든 LikeList 사용
    private LikeList list;

    LikeList front = list;

    // 추가
    public void enqueue(int value) {
        list.insert(list.getSize(), value);
    }
    // 삭제
    public void dequeue() {
        if (!isEmpty()){
            list.delete(0);
        }
    }
    // 큐의 첫번째 값 조회
    public int peek() {
        return list.getHeadDate();
    }
    // 큐가 비었는지 확인
    public boolean isEmpty() {
        return list.isEmpty();
    }
}