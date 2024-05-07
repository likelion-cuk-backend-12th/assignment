package java2.ex06;

public class LikeQueue {
    // ex04에서 만든 LikeList 사용
    private LikeList list;
    private static java2.ex06.LikeList.Node first;
    private static java2.ex06.LikeList.Node end;
    static int size=0;

    public static void main(String[] args) {
        enqueue(1);
        print();
        enqueue(2);
        print();
        enqueue(3);
        print();
        int value = peek();
        if(value==-1)   System.out.println("데이터가 존재하지 않습니다 "+value);
        else    System.out.println("peek를 실행했을 때 반환값: "+value);
        dequeue();
        print();

    }
    public static void enqueue(int value) {
        java2.ex06.LikeList.Node node = new java2.ex06.LikeList.Node(value);

        if(isEmpty()){
            first=node;
            end=node;
        }else{
            end.next=node;
            end=end.next;
        }
        size++;
    }

    // 삭제
    public static void dequeue() {
       if(isEmpty()){
           System.out.println("삭제할 데이터가 큐에 존재하지 않습니다");
       }else{
           first=first.next;
       }
       size--;
    }
    // 큐의 첫번쨰 값 조회
    public static int peek() {
        if(isEmpty()){
            System.out.println("삭제할 데이터가 큐에 존재하지 않습니다");
            return -1;
        }else{
            return first.data;
        }
    }

    // 큐가 비었는지 확인
    public static boolean isEmpty() {
        if(first==null) return true;
        else return false;
    }

    public static void print() {
        java2.ex06.LikeList.Node p = first;

        for(int i=0; i<size; i++){
            System.out.print(p.data+" ");
            p=p.next;
        }
        System.out.println();
    }
}
