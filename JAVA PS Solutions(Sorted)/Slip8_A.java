interface Shape {
    double area();
}

class Circle implements Shape {
    final double r;
    Circle(double r) { this.r = r; }
    public double area() { return Math.PI * r * r; }
}

class Sphere implements Shape {
    final double r;
    Sphere(double r) { this.r = r; }
    public double area() { return 4 * Math.PI * r * r; }
}

public class Slip8_A {
    public static void main(String[] args) {
        Shape circle = new Circle(5), sphere = new Sphere(5);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Sphere Area: " + sphere.area());
    }
}
