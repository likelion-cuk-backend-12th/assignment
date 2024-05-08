package src.java2.ex07;

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
        //root 시작
        if(root == null){
            root = newNode;
            System.out.println("Root = " + newNode.data);
        }
        else{
            //삽입할 위치 탐색
            System.out.println("\n Node = " + newNode.data);

            Node curNode = root;

            while(true){
                if(curNode.data == newNode.data)
                {
                    System.out.println("동일한 값의 노드는 삽입X");
                    return;
                }
                if(curNode.data > newNode.data){
                    //왼쪽으로
                    System.out.println("move to left");
                    if(curNode.left == null)
                        break;
                    curNode = curNode.left;
                }
                else{
                    //오른쪽으로
                    System.out.println("move to right");
                    if(curNode.right == null)
                        break;
                    curNode = curNode.right;
                }
            }
            //탐색된 노드에 새 노드 연결
            if(curNode.data > newNode.data){
                //left Child
                System.out.println("insert in leftChild");
                curNode.left = newNode;
                newNode.parent = curNode;
            }
            else{
                //right Child
                System.out.println("insert in rightChild");
                curNode.right = newNode;
                newNode.parent = curNode;
            }
        }

    }

    // 삭제 메서드
    public void delete(int data) {
        Node cur = root;
        //삭제할 노드 탐색
        while(true){
            if(cur == null)
            {
                System.out.println("Fail to search");
                return;
            }

            if(cur.data == data)
                break;
            if(cur.data > data){
                //left
                //System.out.println("move to left = " + cur.data);
                cur = cur.left;

            }
            else{
                //right
                //System.out.println("move to right = " + cur.data);
                cur = cur.right;
            }
            
        }
        //삭제할 노드 탐색완료
        System.out.println("cur.data = " + cur.data);
        //삭제할 노드의 자식 수가 0인 경우
        Node parent = cur.parent;
        if(cur.left == null & cur.right == null){
            System.out.println("child 0");
            if(parent.data > cur.data){
                //left
                parent.left = null;
            }
            else{
                //right
                parent.right = null;
            }
            cur.parent = null;
        }
        //삭제할 노드의 자식 수가 2인 경우
        else if(cur.left != null & cur.right != null){
            System.out.println("child 2");
            //왼쪽 서브트리에서 제일 큰값 찾기
            Node next;
            next = cur.left;
            while(true){
                if(next.right == null)
                    break;
                next = next.right;
            }
            System.out.println("next.data = " + next.data);
            cur.data = next.data;
            next.parent.right = next.left;
            next.parent = null;
            next.left = null;

        }
        //삭제할 노드의 자식 수가 1인 경우
        else{
            System.out.println("child 1");
            Node next;

            if(cur.left == null) {
                next = cur.right;
                cur.right = null;
            }
            else {
                next = cur.left;
                cur.left = null;
            }

            if(parent.data > cur.data){
                parent.left = next;
            }
            else{
                parent.right = next;
            }

            cur.parent = null;

        }
    }

//    // 전체 노드 출력 메서드 //중위 순회
    //재귀 or 스택
    public void print() {
        inorderTravel(root);
        System.out.println();
    }

    public void inorderTravel(Node root){
        if(root != null){
            inorderTravel(root.left);
            System.out.print(root.data + " ");
            inorderTravel(root.right);
        }
    }
}
