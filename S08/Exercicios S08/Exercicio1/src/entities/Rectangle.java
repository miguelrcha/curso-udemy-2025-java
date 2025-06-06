package entities;

public class Rectangle {
    public double width;
    public double height;

    public double Area(double width, double height) {
        return width * height;
    }

    public double Perimeter(double width, double height) {
        return width + height;
    }

    public double Diagonal(double width, double height) {
        return Math.sqrt(width * width + height * height);
    }

    public String toString() {
        return "Rectangle: "
                + "width=" + width
                + ", height=" + height
                + ", Area=" + Area(width, height)
                + ", Perimeter=" + Perimeter(width, height)
                + ", Diagonal=" + Diagonal(width, height);
    }
}
