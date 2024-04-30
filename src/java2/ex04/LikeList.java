package java2.ex04;

public class LikeList {

    private Node head;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // 삽입 메서드, index 위치에 노드 추가
    public void insert(int index, int data) {
        if (index < 0) {
            return;
        }

        Node newNode = new Node(data);
        int i = 0;
        Node cnt = head;
        while(true){
            if (index == i-1){
                newNode.next = cnt.next;
                cnt.next = newNode;
                return;
            }
            if (cnt == null){
                return;
            }
            cnt = cnt.next;
            i++;
        }

    }

    // 삭제 메서드, index 위치에 노드 삭제
    public void delete(int index) {
        if (index < 0) {
            return;
        }
        int i = 0;
        Node cnt = head;

        if (index == 0){
            head = head.next;
            return;
        }

        while(true){
            if (index == i-1){
               cnt.next = cnt.next.next;
               return;
            }
            if (cnt == null){
                return;
            }
            cnt = cnt.next;
            i++;
        }


    }

    // 전체 노드 출력 메서드
    public void print() {
        Node cnt = head;
        while(cnt != null){
            System.out.println(cnt.data);
            System.out.print(" ");
            cnt = cnt.next;
        }
    }

    public int getHeadDate(){
        return head.data;
    }

    // 리스트가 비어있는지 확인
    public boolean isEmpty() {
        return head == null;
    }

    //리스트 크기 반환
    public int getSize(){
        int size = 0; // 마지막 노드의 인덱스
        Node cnt = head;
        while(cnt != null){
            cnt = cnt.next;
            size ++;
        }
        return size;
    }
}
