package JAVA2.ex04;
public class LikeList {
    private Node head;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int index, int data) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        Node newNode = new Node(data);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node previous = getNode(index - 1);
            newNode.next = previous.next;
            previous.next = newNode;
        }
    }

    public void delete(int index) {
        if (index < 0 || head == null) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        if (index == 0) {
            head = head.next;
        } else {
            Node previous = getNode(index - 1);
            if (previous.next == null) {
                throw new IndexOutOfBoundsException("Invalid index: " + index);
            }
            previous.next = previous.next.next;
        }
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    private Node getNode(int index) {
        if (index < 0 || head == null) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            if (current.next == null) {
                throw new IndexOutOfBoundsException("Invalid index: " + index);
            }
            current = current.next;
        }
        return current;
    }
}

