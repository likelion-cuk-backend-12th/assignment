package java1.ex03;

public class hw_3 {

    static double fi = 3.14;
    public static void main(String[] args) {
        double R = 5;
        System.out.println(calArea(R));
    }

    static double calArea(double radius){
        return radius*radius*fi;
    }
}
