// Aaron Bachmann

// Create the CircleTester class
public class CircleTester {
    public static void main(String[] args) {

        // Create a circle object named circle1
        Circle circle1 = new Circle();

        // Call circle1 object's setX, setY, and setRadius methods, passing arguments
        circle1.setX(16.16456151);
        circle1.setY(15.53827380);
        circle1.setRadius(7.89045257);

        // Print out the area of the circle1 object by calling the getArea method
        System.out.println("Circle 1 area: " + circle1.getArea());

        // Create a circle object named circle2
        Circle circle2 = new Circle();

        // Call circle2 object's setX, setY, and setRadius methods, passing arguments
        circle2.setX(-26.34406212);
        circle2.setY(-29.07724273);
        circle2.setRadius(24.75185579);

        // Print out the area of the circle2 object by calling the getArea method
        System.out.println("Circle 2 area: " + circle2.getArea());

        // Create a circle object named circle3
        Circle circle3 = new Circle();

        // Call circle3 object's setX, setY, and setRadius methods, passing arguments
        circle3.setX(27.53554493);
        circle3.setY(11.79583790);
        circle3.setRadius(35.33559955);

        // Print out the area of the circle3 object by calling the getArea method
        System.out.println("Circle 3 area: " + circle3.getArea());

        // Create a circle object named circle4
        Circle circle4 = new Circle();

        // Call circle3 object's setX, setY, and setRadius methods, passing arguments
        circle4.setX(-45.17083382);
        circle4.setY(-15.18434723);
        circle4.setRadius(47.20847358);

        // Print out the area of the circle4 object by calling the getArea method
        System.out.println("Circle 4 area: " + circle4.getArea());
        System.out.println();

        // Evaluate whether circles overlap by calling the doesOverlap method
        System.out.println("Do Circles 1 and 2 overlap?: " + circle1.doesOverlap(circle2));
        System.out.println();
        System.out.println("Do Circles 1 and 3 overlap?: " + circle1.doesOverlap(circle3));
        System.out.println();
        System.out.println("Do Circles 1 and 4 overlap?: " + circle1.doesOverlap(circle4));
        System.out.println();
        System.out.println("Do Circles 2 and 3 overlap?: " + circle2.doesOverlap(circle3));
        System.out.println();
        System.out.println("Do Circles 2 and 4 overlap?: " + circle2.doesOverlap(circle4));
        System.out.println();
        System.out.println("Do Circles 3 and 4 overlap?: " + circle3.doesOverlap(circle4));
    }
}
