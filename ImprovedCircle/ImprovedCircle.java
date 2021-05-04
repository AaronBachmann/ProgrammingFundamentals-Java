//Aaron Bachmann

public class ImprovedCircle {

    private Point center;
    private double radius;

    /** Constructor 1 - Two argument constructor
     * @param o The new center object reference.
     * @param r The radius of the circle reference.
     */
    public ImprovedCircle(Point o, double r) {
        this.center = new Point(o);
        this.radius = r;
    }

    /** Constructor 2 - Three argument constructor
     * @param xValue The x value reference from Point class.
     * @param yValue The y value reference from Point class.
     * @param r The radius of the circle reference.
     */
    public ImprovedCircle(double xValue, double yValue, double r) {
        this.center = new Point(xValue, yValue);
        this.radius = r;
    }

    /** Constructor 3 - No-argument constructor
     */
    public ImprovedCircle() {
        this.center = new Point(0.0, 0.0);
        this.radius = 1.0;
    }

    /** Constructor 4 - The Copy Constructor
     * @param c The object to copy.
     */
    public ImprovedCircle(ImprovedCircle c) {
        this.center = new Point(c.center);
        this.radius = c.radius;
    }

    /** Create a copy of the center object so that other classes can access directly.
     * @return A reference to the center object.
     */
    public Point getCenter() {
        return new Point(this.center);
    }

    /** Set the center object based on new instance of center object.
     * @param p The new center object reference.
     */
    public void setCenter(Point p) {
        this.center = new Point(p);
    }

    /** setX method
     * @param value The reference to the double x value from the Point class.
     */
    public void setX(double value) {
        this.center.setX(value);
    }

    /** getX method
     * @return A reference to the double x value from the Point class.
     */
    public double getX() {
        return this.center.getX();
    }

    /** setY method
     * @param value The reference to the double y value from the Point class.
     */
    public void setY(double value) {
        this.center.setY(value);
    }

    /** getY method
     * @return A reference to the double y value from the Point class.
     */
    public double getY() {
        return this.center.getY();
    }

    /** setRadius method
     * @param value The radius of the circle reference.
     */
    public void setRadius(double value) {
        this.radius = value;
    }

    /** getRadius method
     * @return The radius of the circle reference.
     */
    public double getRadius() {
        return this.radius;
    }

    /** getArea method to calculate the area of a circle.
     * @return The area of a circle reference.
     */
    public double getArea() {
        double area;
        return area = Math.PI * (this.radius * this.radius);
    }

    /** Format the output of the string for all circle objects.
     * @return A string containing the circle's attributes.
     */
    public String toString() {
        return String.format("(X: %.2f, Y: %.2f) \nRadius: %.2f \nArea: %.2f",
                             this.center.getX(), this.center.getY(), this.radius, this.getArea());
    }

    /** equals method Calculates whether circle reference is the same as circle c reference.
     * @param c A reference to the object to compare against.
     * @return True if circle reference is equal to circle c reference.
     */
    public boolean equals(ImprovedCircle c) {
        return this.center.getX() == c.getX() && this.center.getY() == c.getY() && this.radius == c.radius;
    }

    /** doesOverlap method Calculates if circle reference overlaps with circle c reference.
     * @param c A reference to the object to compare against.
     * @return True if circle reference overlaps with circle c reference.
     */
    public boolean doesOverlap(ImprovedCircle c) {
        double distanceBetweenCenters;
        double sumOfRadii;

        distanceBetweenCenters = Math.sqrt((this.center.getX() - c.getX()) * (this.center.getX() - c.getX()) +
                                          (this.center.getY() - c.getY()) * (this.center.getY() - c.getY()));
        sumOfRadii = this.radius + c.getRadius();

        return sumOfRadii >= distanceBetweenCenters;
    }
}
