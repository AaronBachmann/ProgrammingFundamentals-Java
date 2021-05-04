// Aaron Bachmann

// Create Circle class
public class Circle {

    // Declare private variables
    private double x;
    private double y;
    private double radius;

    /*
    The setX method stores a value in the xValue field.
    @param xValue The value to store in x.
    */
    public void setX(double xValue) {
        x = xValue;
    }

    /*
    The setY method stores a value in the yValue field.
    @param yValue The value to store in y.
    */
    public void setY(double yValue) {
        y = yValue;
    }

    /*
    The setRadius method stores a value in the value field.
    @param value The value to store in radius.
    */
    public void setRadius(double value) {
        radius = value;
    }

    /* The getX method returns a value for x.
    @return The value in the x field.
    */
    public double getX() {
        return x;
    }

    /* The getY method returns a value for y.
    @return The value in the y field.
    */
    public double getY() {
        return y;
    }

    /* The getRadius method returns a value for radius.
    @return The value in the radius field.
    */
    public double getRadius() {
        return radius;
    }

    /* The getArea method calculates the area and returns a value for area.
    @return The value in the area field.
    */
    public double getArea() {
        double area = Math.PI * (radius * radius);
        return area;
    }

    /* The doesOverlap method calculates the distance between the center points of two circles,
     calculates the sum of the two circles radius, and returns true if they don't overlap and false if they do.
    @return The boolean values true or false.
    */
    public boolean doesOverlap(Circle otherCircle) {
        double distanceBetweenCenters;
        double sumOfRadii;

        distanceBetweenCenters = Math.sqrt((x - otherCircle.getX()) * (x - otherCircle.getX())
                + (y - otherCircle.getY()) * (y - otherCircle.getY()));
        sumOfRadii = radius + otherCircle.getRadius();
        System.out.println("Distance between center points: " + distanceBetweenCenters);
        System.out.println("Sum of radii: " + sumOfRadii);

        return sumOfRadii >= distanceBetweenCenters;


    }


}
