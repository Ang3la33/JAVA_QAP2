package Problem2;

public class TestMyRectangle {
    // Test methods in MyRectangle class
    public static void main(String[] args) {

        MyRectangle r1 = new MyRectangle(1, 1, 2, 2);

        MyPoint topLeft = new MyPoint(1, 2);
        MyPoint bottomRight = new MyPoint(3, 4);
        MyRectangle r2 = new MyRectangle(topLeft, bottomRight);

        System.out.println();
        System.out.println("Running Tests For MyTraingle Methods");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println("Test toString method:");
        System.out.println("---------------------");
        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
        System.out.println();
        
        // Getters
        System.out.println("Test Getters");
        System.out.println("------------");
        System.out.println("getTopLeft method on r1:          " + r1.getTopLeft());
        System.out.println("getbottomRight method on r1:      " + r1.getBottomRight());
        System.out.println("getTopLeftX method on r1:          " + r1.getTopLeftX());
        System.out.println("getBottomRightX method on r1:      " + r1.getBottomRightX());
        System.out.println("getTopLeftY method on r1:          " + r1.getTopLeftY());
        System.out.println("getBottomRightY method on r1:      " + r1.getBottomRightY());
        int[] topLeftXY = r2.getTopLeftXY();
        System.out.println("getTopLeftXY method on r2:        (" + topLeftXY[0] + "," + topLeftXY[1] + ")" );
        int[] bottomRightXY = r2.getBottomRightXY();
        System.out.println("getBottomRightXY method on r2:    (" + bottomRightXY[0] + "," + bottomRightXY[1] + ")");
        System.out.println();

        // Setters
        r2.setTopLeft(new MyPoint(2,3));
        r2.setBottomRight(new MyPoint(4,5));
        System.out.println("Test Setters");
        System.out.println("------------");
        System.out.println("Updated r2 after using setTopLeft and setBottomRight methods:      " + r2);
        r1.setTopLeftXY(8,8);
        r1.setBottomRightXY(9,9);
        System.out.println("Updated r1 after using setTopLeftXY and setBottomRightXY methods:  " + r1);
        System.out.println();
        
    }
}
