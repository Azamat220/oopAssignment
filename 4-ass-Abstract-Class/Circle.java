public class Circle extends Shape {
    private double radius;


    public Circle(double r) {
        super("Circle");
        this.radius = r;
    }

    public double getArea() {
        return Math.PI * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
