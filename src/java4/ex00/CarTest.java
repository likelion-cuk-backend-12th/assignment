package java4.ex00;

public class CarTest {
    public static void main(String[] args) {
        MyLittleCar car1 = MyLittleCar.createCar("Sonata");
        MyLittleCar car2 = MyLittleCar.createCar("");
        System.out.println(car1);
        System.out.println(car2);

    }
}
