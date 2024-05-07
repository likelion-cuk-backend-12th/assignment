package src.java2.ex05;

public class LikeStack {
    // ex04에서 만든 LikeList 사용
    private LikeList list = new LikeList();
    static int top = 0;
    // 추가
    public void push(int value) {
        top++;
        list.insert(top-1,value);

    }
    // 삭제
    public void pop() {
        if(isEmpty()){
           return;
        }
        list.delete(top-1);
        top--;
    }
    // 스택의 마지막 값 조회
    public int peek() {
        //System.out.println("peek()::");
        if(isEmpty()){
            return -1;
        }
        //System.out.println("top = " + top);
//        list.print();
//        return 0;
        return list.print(top-1);
    }
    // 스택이 비어있다면 true
    public boolean isEmpty() {
        if(top <= 0) {
            System.out.println("Stack is Empty");
            return true;
        }else
            return false;

    }
}
