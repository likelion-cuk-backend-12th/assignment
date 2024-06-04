package java4.ex00;

public class MyLittleCar {
    String productName;

    public MyLittleCar(String productName) {
        this.productName = productName;
    }
    public String toString() {
        return productName;
    }

    public static MyLittleCar createCar(String name){
        switch (name.toLowerCase()) {
            case "sonata":
                return new Sonata();
            case "grandeur":
                return new Grandeur();
            case "genesis":
                return new Genesis();
            default:
                return new Noname();
        }
    }

}