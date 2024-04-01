package java1.ex03;

public class hw_3 {
    static double calcArea(double radius){
        double Area = 3.14 * radius * radius;
        return Area;
    }


    public static void main(String[] args) {
        System.out.println(calcArea(3));
    }
}
