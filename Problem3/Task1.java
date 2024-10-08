package Problem3;

public class Task1 {
    // Overloading by Writing a Copy Constructor
    public static void main(String[] args) {

        // create m1 Money object
        Money m1 = new Money(100.99);
        // Use a copy constructor that copys m1 to create m2
        Money m2 = new Money(m1);

        // Print both objects to verify copy constructor works properly
        System.out.println();
        System.out.println("Task 1: Overloading by Writing a Copy Constructor");
        System.out.println("-------------------------------------------------");
        System.out.println("m2 has been created using a copy constructor on m1, therefore the return should be equal.");
        System.out.println();
        System.out.println("m1 = " + m1);
        System.out.println("m2 = " + m2);

    }
}
