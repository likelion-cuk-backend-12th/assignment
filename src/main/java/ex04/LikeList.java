package ex04;

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

    public void insert(int index, int data) {
        if (index < 0) {
            throw new IllegalArgumentException("Invalid index");
        }

        Node newNode = new Node(data);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            int count = 0;

            while (current != null && count < index - 1) {
                current = current.next;
                count++;
            }

            if (current == null) {
                throw new IllegalArgumentException("Invalid index");
            }

            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void delete(int index) {
        if (index < 0 || head == null) {
            throw new IllegalArgumentException("Invalid index");
        }

        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            int count = 0;

            while (current != null && count < index - 1) {
                current = current.next;
                count++;
            }

            if (current == null || current.next == null) {
                throw new IllegalArgumentException("Invalid index");
            }

            current.next = current.next.next;
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

    public int get(int index) {
        if (index < 0 || head == null) {
            throw new IllegalArgumentException("Invalid index");
        }

        Node current = head;
        int count = 0;

        while (current != null && count < index) {
            current = current.next;
            count++;
        }

        if (current == null) {
            throw new IllegalArgumentException("Invalid index");
        }

        return current.data;
    }

    public int size() {
        Node current = head;
        int count = 0;

        while (current != null) {
            current = current.next;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        LikeList list = new LikeList();

        list.insert(0, 1);
        list.insert(1, 2);
        list.insert(2, 3);
        list.insert(3, 4);
        list.insert(4, 5);

        list.print();

        list.delete(2);
        list.print();

//        System.out.println(list.get(2));
//        System.out.println(list.size());
    }
}
