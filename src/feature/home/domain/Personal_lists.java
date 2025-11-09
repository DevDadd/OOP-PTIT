package feature.home.domain;

// Danh sách cá nhân
public class Personal_lists {
    private String time;
    private String movie;
    private double cost;

    // Constructor
    public Personal_lists() {
    }

    public Personal_lists(String time, String movie, double cost) {
        this.time = time;
        this.movie = movie;
        this.cost = cost;
    }

    // Getter & Setter
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    // Methods
    public void show() {
        System.out.println("Personal list:");
        System.out.println("Movie: " + movie);
        System.out.println("Time: " + time);
        System.out.println("Cost: " + cost + " VND");
    }
}
