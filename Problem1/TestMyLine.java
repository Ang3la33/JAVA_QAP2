package Problem1;

public class TestMyLine{
    // Test the public methods in MyLine class
    public static void main(String[] args) {
        
        MyLine l1 = new MyLine(1,1,2,2);

        MyPoint begin = new MyPoint(2,4);
        MyPoint end   = new MyPoint(6,8);
        MyLine l2     = new MyLine(begin, end);

        System.out.println();
        System.out.println("Running Tests For MyLine Class Public Methods");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println("Test toString method:");
        System.out.println("---------------------");
        System.out.println("l1: " + l1);
        System.out.println("l2: " + l2);
        System.out.println();

        // Getters
        System.out.println("Test Getters");
        System.out.println("------------");
        System.out.println("getBegin method on l1:    " + l1.getBegin());
        System.out.println("getEnd method on l1:      " + l1.getEnd());
        System.out.println("getBeginX method on l1:      " + l1.getBeginX());
        System.out.println("getEndX method on l1:        " + l1.getEndX());
        System.out.println("getBeginY method on l2:      " + l2.getBeginY());
        System.out.println("getEndY method on l2:        " + l2.getEndY());
        int[] beginXY = l1.getBeginXY();
        System.out.println("getBeginXY method on l1:  (" + beginXY[0] + "," + beginXY[1] + ")");
        
        // Setters
        l2.setBegin(new MyPoint(2,2));
        l2.setEnd(new MyPoint(4,4));
        System.out.println();
        System.out.println("Test Setters");
        System.out.println("------------");
        System.out.println("Updated l2 after using setBegin and setEnd methods:      " + l2);
        l1.setBeginXY(3, 3);
        l1.setEndXY(6, 6);
        System.out.println("Updated l1 after using setBeginXY and setEndXY methods:  " + l1);
        System.out.println();

        //Get Length
        System.out.println("Get the length of l1 using getLength method: ");
        System.out.println("-------------------------------------------- ");
        System.out.println("l1 = " +l1);
        System.out.println("Length of l1 = " + l1.getLength());

        //Get Gradient
        System.out.println();
        System.out.println("Get the gradient of l2 using getGradient method: ");
        System.out.println("------------------------------------------------ ");
        System.out.println("l2 = " + l2);
        System.out.println("Gradient of l2 = " + l2.getGradient());

        System.out.println();








        
        
        
        

        
    }
}