package java2.ex04;

public class Main {
    public static void main(String[] args) {
        LikeList numbers = new LikeList();
        numbers.insert(0,10);
        numbers.insert(1,20);
        numbers.insert(2,30);
        numbers.delete(2);
        numbers.delete(0);
        numbers.delete(0);
        numbers.print();
    }
}