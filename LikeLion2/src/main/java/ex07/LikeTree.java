package ex07;

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

    public void insert(int data) {
        root = insertNode(root, null, data);
    }

    private Node insertNode(Node node, Node parent, int data) {
        if (node == null) {
            node = new Node(data);
            node.parent = parent;
        } else if (data < node.data) {
            node.left = insertNode(node.left, node, data);
        } else {
            node.right = insertNode(node.right, node, data);
        }
        return node;
    }

    public void delete(int data) {
        root = deleteNode(root, data);
    }

    private Node deleteNode(Node node, int data) {
        if (node == null) {
            return null;
        }

        if (data < node.data) {
            node.left = deleteNode(node.left, data);
        } else if (data > node.data) {
            node.right = deleteNode(node.right, data);
        } else {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

            Node successor = findMinNode(node.right);
            node.data = successor.data;
            node.right = deleteNode(node.right, successor.data);
        }

        return node;
    }

    private Node findMinNode(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public void print() {
        printInOrder(root);
        System.out.println();
    }

    private void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.data + " ");
            printInOrder(node.right);
        }
    }
}