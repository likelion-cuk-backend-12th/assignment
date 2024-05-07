package src.java2.ex07;

public class Main {
    public static void main(String[] args) {
        //여기서 트리를 시작을 해야되네
        LikeTree tree = new LikeTree();

        //트리 생성
        tree.insert(8);
        tree.insert(10);
        tree.insert(14);
        tree.insert(3);
        tree.insert(2);
        tree.insert(5);
        tree.insert(11);
        tree.insert(16);
        tree.insert(4);

        tree.print();

//        tree.delete(11);
//        tree.print();
//        tree.delete(10);
//        tree.print();
//        tree.delete(17);
        tree.delete(8);
        tree.print();

    }
}
