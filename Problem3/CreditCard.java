package Problem3;

public class CreditCard{

    // Attribute(s)
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // Contructor(s)
    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit);
        this.balance = new Money(0);
    }

    // Getters
    public Money getBalance() {
        return new Money(this.balance);
    }

    public Money getCreditLimit() {
        return new Money(this.creditLimit);
    }

    public String getPersonals() {
        return (this.owner.toString());
    }

    // Method to make a charge to the credit card
    public void charge(Money amount) {
        // Calculate the new balance after charge
        Money newBalance = this.balance.add(amount);
        // Check if the new balance exceeds credit limit
        if (newBalance.compareTo(this.creditLimit) <= 0) {
            // If charge is valid update the balance 
            this.balance = newBalance;
            System.out.println("Charge: " + amount);
        } else {
            // If charge exceeds credit limit reject charge
            System.out.println("Exceeds credit limit");
        }
    }

    // Method to make a payment to the credit card
    public void payment(Money amount) {
        // Calculate the new balance after payment
        Money newBalance = this.balance.subtract(amount);
        // Update the new balance
        this.balance = newBalance;
        // Print a confirmation message
        System.out.println("Payment: " + amount);
    }


}