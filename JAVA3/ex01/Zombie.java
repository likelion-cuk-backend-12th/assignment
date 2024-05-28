package JAVA3.ex01;

public class Zombie {
    public Zombie() {
        System.out.println("Grraaaaaa...");
    }

    public Zombie bite() {
        return new Zombie();
    }
}