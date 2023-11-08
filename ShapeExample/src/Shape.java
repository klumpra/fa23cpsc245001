public abstract class Shape implements Comparable<Shape>{
    private Point origin;
    public String getType() {
        return "shape";
    }
    public Shape() {
        origin = new Point();  // composition - the owner is responsible for creating the thing it owns
    }
    public Shape(double x, double y) {
        origin = new Point(x,y);
    }
    public double getX() {
        return origin.getX();   // delegation - the owner asks the owned to carry out a task
    }
    public double getY() {
        return origin.getY();
    }
    public void setX(double x) {
        origin.setX(x);
    }
    public void setY(double y) {
        origin.setY(y);
    }
    public Point getOrigin() {
        return origin;
    }
    public void setOrigin(Point pt) {
        origin = pt;         // aggregation - the owned object has been created already somewhere else
    }
    public void setOrigin(double x, double y) {
        origin = new Point(x,y);
    }
    @Override 
    public String toString() {
        return String.format("%s\t%s",getType(),origin.toString()); // delegation
    }
    public double getDistanceFromCartesianOrigin() {
        return origin.getDistanceFromCartesianOrigin();
    }
    /**
     * natural sort order is based on distance from Cartesian origin
     */
    @Override
    public int compareTo(Shape s) {
        double myDistance = getDistanceFromCartesianOrigin();
        double otherDistance = s.getDistanceFromCartesianOrigin();
        if (myDistance < otherDistance) {
            return -1;
        } else if (myDistance == otherDistance) {
            return 0;
        } else {
            return 1;
        }
    }
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
