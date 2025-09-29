package feature.home.domain;

public class movie {
    private int id;
    private String title;
    private String genre;
    private int duration;
    private double rating;
    private String description;
    private String bannerURL;

    public movie(int id, String title, String genre, int duration, double rating, String description,
            String bannerURL) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.rating = rating;
        this.description = description;
        this.bannerURL = bannerURL;
    }

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }

    public void show() {
    }
}
