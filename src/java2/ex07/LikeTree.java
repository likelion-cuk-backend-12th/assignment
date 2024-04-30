package java2.ex07;
public class LikeTree {

    private Node root;

    private class Node {
        int data;
        Node parent;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            parent = null;
            left = null;
            right = null;
        }
    }

    // 삽입 메서드
    public void insert(int data) {
        Node newNode = new Node(data);

        while(true){
           // if ()
        }

    }

    // 삭제 메서드
    public void delete(int data) {

    }

    // 전체 노드 출력 메서드
    public void print() {

    }
}
