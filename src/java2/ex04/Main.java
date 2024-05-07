package src.java2.ex04;

public class Main {
    public static void main(String[] args) {
        LikeList list = new LikeList();

        //createList
        list.insert(-1,0);
        list.print();
        list.insert(1,1);
        list.print();
        list.insert(2,2);
        list.print();
        list.insert(3,3);
        list.print();
        list.insert(4,4);
        list.print();
        list.insert(2,7);
        list.print();
        list.insert(0,5);
        list.print();
        list.delete(3);
        list.print();
        //list.delete(6);

    }
}
