package Problem2;

public class MyRectangle {
    
    // Instances
    private MyPoint topLeft;
    private MyPoint bottomRight;


    // Constructors
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1,y1);
        this.bottomRight = new MyPoint(x2,y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getters
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public int getTopLeftX() {
        return this.topLeft.getX();
    }

    public int getTopLeftY() {
        return this.topLeft.getY();
    }

    public int getBottomRightX() {
        return this.bottomRight.getX();
    }
    
    public int getBottomRightY() {
        return this.bottomRight.getY();
    }

    public int[] getTopLeftXY() {
        int t[] = {this.topLeft.getX() , this.topLeft.getY()};
        return t;
    }

    public int[] getBottomRightXY() {
        int b[] = {this.bottomRight.getX() , this.bottomRight.getY()};
        return b;
    }

    // Setters
    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public void setTopLeftX(int x) {
        this.topLeft.setX(x);
    }

    public void setTopLeftY(int y) {
        this.topLeft.setY(y);
    }

    public void setBottomRightX(int x) {
        this.bottomRight.setX(x);
    }

    public void setBottomRightY(int y) {
        this.bottomRight.setY(y);
    }

    public void setTopLeftXY(int x, int y) {
        this.topLeft.setXY(x, y);
    }

    public void setBottomRightXY(int x, int y) {
        this.bottomRight.setXY(x, y);
    }

    // Format String for toString method
    public String toString() {
        return ("My Rectangle [topLeft = " + this.topLeft.toString() + " , " + "bottomRight = " + this.bottomRight.toString() + "]");
    }


}
