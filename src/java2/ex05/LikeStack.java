package java2.ex05;

import org.w3c.dom.Node;

import static java2.ex05.LikeList.print;

public class LikeStack {
    private LikeList list;
    private static java2.ex05.LikeList.Node top;

    static int size=0;
    public static void main(String[] args) {
        push(1);
        print();
        push(2);
        print();
        push(3);
        print();
        int value = peek();
        if(value==-1)   System.out.println("데이터가 존재하지 않습니다 "+value);
        else    System.out.println("peek를 실행했을 때 반환값: "+value);
        pop();
        print();
    }

    // 추가
    public static void push(int value) {
        java2.ex05.LikeList.Node node = new java2.ex05.LikeList.Node(value);

        if(isEmpty()) {
            top = node;

        }else{
            node.next=top;
            top=node;
        }
        size++;
    }

    // 삭제
    public static void pop() {

        if(isEmpty()){
            System.out.println("리스트에 데이터가 없습니다");
            return;
        }
        else{
            top=top.next;
        }
        size--;
    }

    // 스택의 마지막 값 조회
    public static int peek() {
        if(isEmpty()){
            System.out.println("리스트에 데이터가 없습니다");
            return -1;
        }
        return top.data;
    }

    // 스택이 비어있다면 true
    public static boolean isEmpty() {
        if(top==null) return true;
        else return false;
    }

    public static void print(){
        java2.ex05.LikeList.Node p = top;
        if(isEmpty()){
            System.out.println("리스트에 데이터가 없습니다");
            return;
        }else{
            for(int i=0; i<size; i++){
                System.out.print(p.data+" ");
                p=p.next;
            }
            System.out.println();
        }
    }
}
