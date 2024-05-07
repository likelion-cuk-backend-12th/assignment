package JAVA2.ex07;

public class LikeTree {
    private Node root;

    private class Node {
        int data;
        Node parent, left, right;

        Node(int data) {
            this.data = data;
            this.parent = null;
            this.left = null;
            this.right = null;
        }
    }

    public void insert(int data) {
        root = insertRecursive(root, null, data);
    }

    private Node insertRecursive(Node current, Node parent, int data) {
        if (current == null) {
            Node newNode = new Node(data);
            newNode.parent = parent;
            return newNode;
        }

        if (data < current.data) {
            current.left = insertRecursive(current.left, current, data);
        } else {
            current.right = insertRecursive(current.right, current, data);
        }

        return current;
    }

    public void delete(int data) {
        root = deleteRecursive(root, data);
    }

    private Node deleteRecursive(Node current, int data) {
        if (current == null) {
            return null;
        }

        if (data == current.data) {
            if (current.left == null && current.right == null) {
                return null;
            }

            if (current.left == null) {
                current.right.parent = current.parent;
                return current.right;
            }

            if (current.right == null) {
                current.left.parent = current.parent;
                return current.left;
            }

            Node smallest = findSmallestNode(current.right);
            current.data = smallest.data;
            current.right = deleteRecursive(current.right, smallest.data);
            return current;

        } else if (data < current.data) {
            current.left = deleteRecursive(current.left, data);
            return current;
        } else {
            current.right = deleteRecursive(current.right, data);
            return current;
        }
    }

    private Node findSmallestNode(Node root) {
        return root.left == null ? root : findSmallestNode(root.left);
    }

    public void print() {
        inorderTraversalRecursive(root);
    }

    private void inorderTraversalRecursive(Node node) {
        if (node != null) {
            inorderTraversalRecursive(node.left);
            System.out.print(node.data + " ");
            inorderTraversalRecursive(node.right);
        }
    }
}

