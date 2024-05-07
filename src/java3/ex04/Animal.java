package java3.ex04;

public abstract class Animal {

    protected String name;

    public Animal(Brain brain){
        this.name = brain.getName();
    }

    public abstract void makeSound();

    public static void main(String[] args) {

        Animal nabi = new Cat(new Brain("nabi"));
        Animal choco = new Dog(new Brain("choco"));

        nabi.makeSound();
        choco.makeSound();
    }


}
