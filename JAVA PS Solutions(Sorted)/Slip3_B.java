abstract class Shape {
    abstract double area();
    abstract double volume();
}

class Cone extends Shape {
    double r, h;
    Cone(double r, double h) { this.r = r; this.h = h; }
    @Override
    double area() { return Math.PI * r * (r + Math.sqrt(h * h + r * r)); }
    @Override
    double volume() { return Math.PI * r * r * h / 3; }
}

class Cylinder extends Shape {
    double r, h;
    Cylinder(double r, double h) { this.r = r; this.h = h; }
    @Override
    double area() { return 2 * Math.PI * r * (r + h); }
    @Override
    double volume() { return Math.PI * r * r * h; }
}

public class Slip3_B {
    public static void main(String[] args) {
        Shape cone = new Cone(3, 5), cylinder = new Cylinder(3, 5);
        System.out.println("Cone Area: " + cone.area() + ", Volume: " + cone.volume());
        System.out.println("Cylinder Area: " + cylinder.area() + ", Volume: " + cylinder.volume());
    }
}
