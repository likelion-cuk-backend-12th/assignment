package src.java2.ex06;

public class LikeList {
    private Node head;

    private class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    //삽입
    public void insert(int index, int data){
        Node insertNode = new Node(data);

        if(head == null||index < 0){
            System.out.println("createList or firstNode");
            insertNode.next = head;
            head = insertNode;
        }
        else{   //index 뒤에 삽입
            //System.out.println("insert middle pos");
            Node pre = head;

            for(int i = 0; i < index-1; i++)
            {
                if(pre.next == null)
                    break;
                pre = pre.next;
            }
            if(pre.next != null){
                //System.out.println("middle insert");
                insertNode.next = pre.next;
                pre.next = insertNode;
            }
            else{
                //System.out.println("last insert");
                insertNode.next = pre.next;
                pre.next = insertNode;
            }

        }
    }
    //삭제
    public void delete(int index){
        Node deleteNode = head;
//        System.out.println("head.data = " + head.data);
        System.out.println("\ndelete = " + deleteNode.data);

        if(head.next != null)
        {
            head.data = deleteNode.next.data;
            head.next = deleteNode.next.next;
        }
        else{
            head.data = 0;
            head.next = null;
        }

//        for(int i = 0; i <= index; i++)
//        {
//            System.out.print(pre.data + " ");
//            pre = pre.next;
//        }
//        Node deleteNode = pre.next;
//        System.out.println("deleteNode = " + deleteNode.data);
//        pre.next = deleteNode.next;



    }
    //출력
    public void print(){
        Node cur = head;

        while(cur != null){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //stack용 print
    public int print(int index){
        Node cur = head;
//        for(int i = 0; i <= index; i++)
//        {
//            System.out.print(cur.data + " ");
//        }

        return cur.data;
    }

}
