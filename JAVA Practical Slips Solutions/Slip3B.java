abstract class Shape {
    abstract double area();
    abstract double volume();
}
abstract class Shape3D extends Shape {
    double radius;
    double height;
    Shape3D(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
}
class Cone extends Shape3D {
    Cone(double radius, double height) {
        super(radius, height);
    }
   @Override
    double area() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }
    @Override
    double volume() {
        return (Math.PI * radius * radius * height) / 3;
    }
}
class Cylinder extends Shape3D {
    Cylinder(double radius, double height) {
        super(radius, height);
    }
    @Override
    double area() {
        return 2 * Math.PI * radius * (radius + height);
    }
    @Override
    double volume() {
        return Math.PI * radius * radius * height;
    }
}
public class Slip3B {
    public static void main(String[] args) {
        Shape cone = new Cone(5, 10);
        System.out.println("Cone Area: " + cone.area());
        System.out.println("Cone Volume: " + cone.volume());
        Shape cylinder = new Cylinder(5, 10);
        System.out.println("Cylinder Area: " + cylinder.area());
        System.out.println("Cylinder Volume: " + cylinder.volume());
    }
}