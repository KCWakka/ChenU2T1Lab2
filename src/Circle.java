// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Circle {

    private final double piNum = Math.PI;
    private double radius;

    public Circle(double radiusLen) {
        radius = radiusLen;
    }
    public void printCircleArea() {
        double circleArea = piNum * radius * radius;
        System.out.println("The circle area is " + circleArea);
    }

}

