package DeCuong.phan1;

public class Shape {
    private String ShapeName;
    private String color;

    Shape() {

    }

    Shape(String ShapeName, String color) {
        this.ShapeName = ShapeName;
        this.color = color;
    }

    public String getShapeName() {
        return ShapeName;
    }

    public String getColor() {
        return color;
    }

    public void setShapeName(String shapeName) {
        this.ShapeName = shapeName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "ShapeName='" + ShapeName + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}
