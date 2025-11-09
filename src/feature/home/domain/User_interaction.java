package feature.home.domain;

// Tương tác người dùng
public class User_interaction {
    // Constructor
    public User_interaction() {
    }

    // Methods
    public void booking(Ticket ticket) {
        System.out.println("Booking ticket...");
        ticket.show();
    }

    public void payment(Ticket ticket) {
        System.out.println("Processing payment for ticket...");
        System.out.println("Amount: " + ticket.getCost() + " VND");
        System.out.println("Payment successful!");
    }
}
