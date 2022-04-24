// Circle

public class Circle {

    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            radius = 0;
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double area = radius * radius * Math.PI;
        return area;
    }
}

// Cylinder

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            height = 0;
        }
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume() {
        double volume = getArea() * height;
        return volume;
    }
}
