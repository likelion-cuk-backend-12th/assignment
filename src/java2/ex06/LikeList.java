package java2.ex06;

public class LikeList {
    private static Node head;

    public static void main(String[] args) {
        Node node = new Node(1);
        head = node;
        print();
        insert(1, 2);
        print();
        insert(2, 3);
        print();
        insert(0, 4);
        print();

        delete(2);
        print();

    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // 삽입 메서드, index 위치에 노드 추가
    public static void insert(int index, int data) {
  /*      int count=0;
        Node countnode = head;

        if(index<0){
            System.out.println("잘못된 인덱스");
            return;
        }
        Node node = new Node(data);

        if(index==0){
            node.next=head;
            head=node;
        }else if(countnode.next!=null&& count<index-1){  //count가 index 전 node에 왔을 때 if문 벗어남
            countnode=countnode.next;
            count++;
        }


        node.next=countnode.next;
        countnode.next=node;
*/
        int count=0;
        Node countnode = head;

        if(index<0){
            System.out.println("잘못된 인덱스");
            return;
        }

        Node node = new Node(data);


        if(index==0){
            node.next=head;
            head=node;
            return;
        }


        Node current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null){
            System.out.println("null값");
            return;
        }


        node.next = current.next;
        current.next = node;

    }

    // 삭제 메서드, index 위치에 노드 삭제
    public static void delete(int index) {

        int count=0;
        Node countnode = head;

        if(index<0){
            System.out.println("잘못된 인덱스");
            return;
        }

        if(index==0){
            head=head.next;
        }else if(countnode!=null&& count<index-1){  //count가 index 전 node에 왔을 때 if문 벗어님
            countnode=countnode.next;
            count++;
        }

        if(countnode==null){
            return;
        }

        countnode.next=countnode.next.next;

    }

    // 전체 노드 출력 메서드
    public static void print() {
        Node printnode = head;

        while(printnode!=null){
            System.out.print(printnode.data+" ");
            printnode=printnode.next;
        }
        System.out.println();

    }
}
