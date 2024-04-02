package java1.ex03;

public class hw_3 {
    public static void main(String[] args) {
        calcArea(3);
    }
    public static double calcArea(int radious){
        double pi = 3.14;
        double Area = radious * radious * pi;
        System.out.println(Area);
        return Area;
    }
}
