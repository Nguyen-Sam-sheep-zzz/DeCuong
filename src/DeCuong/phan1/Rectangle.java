package DeCuong.phan1;

public class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle() {

    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    Rectangle(double width , double height, String color, String ShapeName) {
        super(color,ShapeName);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle [" +
                "width = " + width +
                ", height = " + height +
                ", name = " + getShapeName() +
                ", color = " + getColor() +
                "]";
    }

    public double getArea() {
        return getHeight() * getWidth();
    }

}
