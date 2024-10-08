class Area {
    double area(double radius) { // Circle
        return Math.PI * radius * radius;
    }
    
    double area(double base, double height) { // Triangle
        return 0.5 * base * height;
    }
    
    double area(double length, double width) { // Rectangle
        return length * width;
    }
}

public class Slip18_A {
    public static void main(String[] args) {
        Area a = new Area();
        System.out.println("Area of Circle: " + a.area(5)); // Example for Circle
        System.out.println("Area of Triangle: " + a.area(4, 5)); // Example for Triangle
        System.out.println("Area of Rectangle: " + a.area(4, 6)); // Example for Rectangle
    }
}
