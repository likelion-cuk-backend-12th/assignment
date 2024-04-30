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
        if (root == null) {
            root = new Node(data);
            return;
        }

        Node newNode = new Node(data);
        Node parent = null;
        Node current = root;

        while (current != null) {
            parent = current;
            if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        newNode.parent = parent;
        if (data < parent.data) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }

    // 삭제 메서드
    public void delete(int data) {
        Node delNode = TreeSearch(root, data);

        if (delNode == null) {
            return;
        }

        if (delNode.left == null && delNode.right == null) {
            // 단말노드인 경우
            if (delNode.parent == null) {
                root = null;
            } else if (delNode.parent.left == delNode) {
                delNode.parent.left = null;
            } else {
                delNode.parent.right = null;
            }

        } else if (delNode.left == null || delNode.right == null) {
            // 자식이 하나 있는 경우
            Node child = (delNode.left != null) ? delNode.left : delNode.right;

            if (delNode.parent == null) {
                root = child;
            } else if (delNode.parent.left == delNode) {
                delNode.parent.left = child;
            } else {
                delNode.parent.right = child;
            }

        } else {
            // 자식이 둘인 경우
            Node minChild = minimumSearch(delNode.right);

            delNode.parent.right = minChild;
            if (minChild.parent.left == minChild) {
                minChild.parent.left = minChild.right;
            } else {
                minChild.parent.right = minChild.right;
            }

            minChild.left = delNode.left;
            minChild.right = delNode.right;
            minChild.parent = delNode.parent;

            if (delNode.parent == null){
                root = minChild;
            } else if (delNode == delNode.parent.left) {
            delNode.parent.left = minChild;
            } else {
            delNode.parent.right = minChild;
            }

            delNode = null;
        }
    }

    // 전체 노드 출력 메서드
    public void print() {
        inorderSearch(root);
    }

    // 탐색 메서드
    private Node TreeSearch(Node root, int data){
        if (root == null || root.data == data){
            return root;
        }

        if(root.data > data){
            return TreeSearch(root.left, data);
        }else {
            return  TreeSearch(root.right, data);
        }
    }

    // 오른쪽 자식 노드 중 가장 작은 자식 노드 찾기
    private Node minimumSearch(Node node) {
        while (node.left != null){
            node = node.left;
        }
        return node;
    }

    // 중순위 순회
    private void inorderSearch(Node root) {
            if (root != null){
                inorderSearch(root.left);
                System.out.println(root.data+" ");
                inorderSearch(root.right);
            }
    }
}
