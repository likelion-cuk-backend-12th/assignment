package JAVA1.ex03;

public class hw_3 {
    public static double calcArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        double radius = 5.0;
        double area = calcArea(radius);
        System.out.println("78.54 = " + area);
    }

}
