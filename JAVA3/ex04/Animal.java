package JAVA3.ex04;

public abstract class Animal {
    private String name;
    private Brain brain;

    public Animal(String name) {
        this.name = name;
        this.brain = new Brain(name);
    }

    public String getName() {
        return name;
    }

    public Brain getBrain() {
        return brain;
    }

    public abstract void makeSound();
}
