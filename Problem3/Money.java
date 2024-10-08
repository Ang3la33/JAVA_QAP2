package Problem3;

public class Money {
    
    private long dollars;
    private long cents;

    // Constructors
    public Money(double amount) {
        // To get the amount you need to convert it to cents and then round the number to prevent conversion errors
        long totalCents = Math.round(amount * 100);
        // Divide the total cents by 100 to get the dollar value
        dollars = totalCents / 100;
        // Get the remainder after dividing total cents by 100 to get the cent value
        cents = totalCents % 100;
    }

    // copy constructor
    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    public Money add(Money otherAmount) {
        // Get the totals of the dollars and cents from current and otherAmount objects
        long totalCents = this.cents + otherAmount.cents;
        long totalDollars = this.dollars + otherAmount.dollars;
        // If totalCents exceeds 100 it must be converted to dollars
        if (totalCents >= 100) {
            // convert excess cents to dollars
            totalDollars += totalCents / 100;
            // keep remaining cents
            totalCents = totalCents % 100;
        }
        // Return the new Money object with updated sum of cents and dollars
        return new Money(totalDollars + (totalCents / 100.0));
    }

    public Money subtract(Money otherAmount) {
        // Subtract the dollars and cents from the current object and the otherAmount object
        long totalCents = this.cents - otherAmount.cents;
        long totalDollars = this.dollars - otherAmount.dollars;
        // If cents become negative borrow 100 cents(1 dollar)
        if (totalCents < 0) {
            totalDollars -= 1;
            totalCents += 100;
        }
        // Return the updated new Money object
        return new Money(totalDollars + (totalCents / 100.0));
    }

    public int compareTo(Money otherAmount) {
        // Convert both objects to total cents
        long thisTotalCents = this.dollars * 100 + this.cents;
        long otherTotalCents = otherAmount.dollars * 100 + otherAmount.cents;
        // Use compare Java method to return either 1, -1, or 0 based on comparison of two objects
        return Long.compare(thisTotalCents, otherTotalCents);
    }

    public boolean equals(Money otherObject) {
        // Check if the provided objects are the same instance
        if (this == otherObject) {
            return true;
        }
        // Check if the object is null
        if (otherObject == null) {
            return false;
        }
        // Compare the dollar and cent values
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    public String toString() {
        return ("$" + this.dollars + "." + String.format("%02d", this.cents));
    }
}