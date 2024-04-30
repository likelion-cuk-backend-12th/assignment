package java2.ex5;
import java2.ex04.*;

public class LikeStack {

    // ex04에서 만든 LikeList 사용
    private LikeList list;
    // 추가
    public void push(int value) {
        list.insert(0,value);
    }
    // 삭제
    public void pop() {
		 list.delete(0);
    }
    // 스택의 마지막 값 조회
    public int peek() {
       return list.getHeadDate();
    }

    // 스택이 비어있다면 true
    public boolean isEmpty() {
        return list.isEmpty();
    }
}