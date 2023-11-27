import java.io.Serializable;
public class Circle implements Serializable {
    private double x;
    private double y;
    private double radius;
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Circle() {
        x = 0;
        y = 0;
        radius = 0;
    }
    public Circle(double x, double y, double radius) {
        setX(x);
        setY(y);
        setRadius(radius);
    }
    @Override
    public String toString() {
        return String.format("%.2f\t%.2f\t%.2f",x,y,radius);
    }
}