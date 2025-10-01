package feature.home.domain;

// Vé xem phim
public class Ticket {

    private String showtime;
    private String seat;
    private String room;
    private String cinema;
    private double cost;

    // Constructor
    public Ticket() {
    }

    public Ticket(String showtime, String seat, String room, String cinema, double cost) {
        this.showtime = showtime;
        this.seat = seat;
        this.room = room;
        this.cinema = cinema;
        this.cost = cost;
    }

    // Getter & Setter
    public String getShowtime() {
        return showtime;
    }

    public String getSeat() {
        return seat;
    }

    public String getRoom() {
        return room;
    }

    public String getCinema() {
        return cinema;
    }

    public double getCost() {
        return cost;
    }

    // Methods
    public void show() {
        System.out.println("Ticket info:");
        System.out.println("Cinema: " + cinema);
        System.out.println("Room: " + room);
        System.out.println("Seat: " + seat);
        System.out.println("Showtime: " + showtime);
        System.out.println("Cost: " + cost + " VND");
    }
}
