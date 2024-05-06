package java2.ex05;

public class LikeList {
    private Node head;

    public class Node{             //이너클래스
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node node(int index){
        Node x = head;
        for(int i = 0; i<index; i++)
            x = x.next;
        return x;
    }
/*-----------------------------------------------------*/
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head= newNode;
    }
    public void insert(int index, int data){
        if(index == 0 ){
            addFirst(data);
        }
        else {
            Node temp1 = node(index - 1);
            Node temp2 = temp1.next;
            Node newNode = new Node(data);
            temp1.next = newNode;
            newNode.next = temp2;
        }
    }
/*-----------------------------------------------------------*/
    public void removeFirst(){
        Node temp = head;
        head = head.next;
    }
    public void delete(int index){
        if(index == 0){
            removeFirst();
        }
        else{
            Node temp = node(index-1);
            temp.next = temp.next.next;
        }


    }
/*----------------------------------------------------------*/
    public String toString(){
        if(head == null){
            return "[]";
        }
        Node temp = head;
        String str = "[";
        while(temp.next != null){
            str += temp.data + ", ";
            temp = temp.next;
        }
        str += temp.data;
        return str+ "]";
    }

    public void print(){
        String str = toString();
        System.out.println(str);
    }
}
