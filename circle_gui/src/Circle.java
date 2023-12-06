import java.util.ArrayList;
public class Circle {
    private double radius;
    private double x;
    private double y;
    private String comment;
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getX() {
        return x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getY() {
        return y;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public Circle() {
        comment = "";
        radius = 0;
        x = 0;
        y = 0;
    }
    public Circle(double x, double y, double radius, String comment) {
        setX(x);
        setY(y);
        setRadius(radius);
        setComment(comment);
    }
    @Override
    public String toString() {
        return String.format("rad=%.2f, x=%.2f, y=%.2f, c=%s",radius,x,y,comment);
    }
    public double calcArea() {
        return Math.PI * radius * radius;
    }
    public static double getTotalArea(ArrayList<Circle> circles) {
        double total = 0;
        for (Circle c : circles) {
            total = total + c.calcArea();
        }
        return total;
    }
}