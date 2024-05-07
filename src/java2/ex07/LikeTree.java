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
        root = insertRecursive(root, data);
    }

    private Node insertRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = insertRecursive(current.left, data);
            current.left.parent = current; // 부모 노드 설정
        } else if (data > current.data) {
            current.right = insertRecursive(current.right, data);
            current.right.parent = current; // 부모 노드 설정
        }

        return current;
    }

    // 삭제 메서드
    public void delete(int data) {
        root = deleteRecursive(root, data);
    }

    private Node deleteRecursive(Node current, int data) {
        if (current == null) {
            return null;
        }

        if (data == current.data) {
            // 삭제할 노드를 찾았을 때
            if (current.left == null && current.right == null) {
                // 자식이 없는 경우
                return null;
            }
            if (current.right == null) {
                // 왼쪽 자식만 있는 경우
                current.left.parent = current.parent; // 부모 노드 재조정
                return current.left;
            }
            if (current.left == null) {
                // 오른쪽 자식만 있는 경우
                current.right.parent = current.parent; // 부모 노드 재조정
                return current.right;
            }
            // 양쪽 자식이 모두 있는 경우
            int smallestValue = findSmallestValue(current.right);
            current.data = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }

        if (data < current.data) {
            current.left = deleteRecursive(current.left, data);
            return current;
        }

        current.right = deleteRecursive(current.right, data);
        return current;
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.data : findSmallestValue(root.left);
    }


    // 전체 노드 출력 메서드
    public void print() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }
}