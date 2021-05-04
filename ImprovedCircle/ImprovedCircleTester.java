// Aaron Bachmann

public class ImprovedCircleTester {
    public static void main(String[] args) {
        ImprovedCircle circle1, circle2, circle3, circle4;
        Point point1;
        //ImprovedCircle[] circle = new ImprovedCircle[4];

        // Create circle 1 using the Two Argument Constructor
        point1 = new Point(27.53554493, 11.79583790);
        circle1 = new ImprovedCircle(point1, 35.33559955);

        // Create circle2 using the Three argument Constructor
        circle2 = new ImprovedCircle(-26.34406212, -29.07724273, 24.75185579);

        // Create circle3 using the No-Argument Constructor
        circle3 = new ImprovedCircle();

        // Create circle4 using the Copy Constructor
        circle4 = new ImprovedCircle(circle1);

        // Print circle attributes
        System.out.println("Circle 1 info: \n" + circle1);
        System.out.println("\nCircle 2 info: \n" + circle2);
        System.out.println("\nCircle 3 info: \n" + circle3);
        System.out.println("\nCircle 4 info: \n" + circle4);
        System.out.println();

        // Check if circles overlap calling the doesOverlap() method
        if (circle1.doesOverlap(circle2)) {
            System.out.println("Circle 1 overlaps Circle 2.");
        }
        if (circle1.doesOverlap(circle3)) {
            System.out.println("Circle 1 overlaps Circle 3.");
        }
        if (circle1.doesOverlap(circle4)) {
            System.out.println("Circle 1 overlaps Circle 4.");
        }
        if (circle2.doesOverlap(circle3)) {
            System.out.println("Circle 2 overlaps Circle 3.");
        }
        if (circle2.doesOverlap(circle4)) {
            System.out.println("Circle 2 overlaps Circle 4.");
        }
        if (circle3.doesOverlap(circle4)) {
            System.out.println("Circle 3 overlaps Circle 4.");
        }

        System.out.println();

        // Check if the Circles are the same calling equals() method
        if (circle1.equals(circle2)) {
            System.out.println("Circle 1 and Circle 2 are the same.");
        }
        if (circle1.equals(circle3)) {
            System.out.println("Circle 1 and Circle 3 are the same.");
        }
        if (circle1.equals(circle4)) {
            System.out.println("Circle 1 and Circle 4 are the same.");
        }
        if (circle2.equals(circle3)) {
            System.out.println("Circle 2 and Circle 3 are the same.");
        }
        if (circle2.equals(circle4)) {
            System.out.println("Circle 2 and circle 4 are the same.");
        }
        if (circle3.equals(circle4)) {
            System.out.println("Circle 3 and Circle 4 are the same.");
        }

    }

}
