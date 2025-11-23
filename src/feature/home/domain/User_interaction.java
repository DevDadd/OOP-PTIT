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

    public List<Movie> searchMovieByTitle(List<Movie> movies, String titleKeyword) {
        List<Movie> results = new ArrayList<>();
        if (titleKeyword == null || titleKeyword.trim().isEmpty()) {
            System.out.println("Vui lòng nhập từ khóa tìm kiếm.");
            return results;
        }

        String lowerCaseKeyword = titleKeyword.toLowerCase();

        for (Movie movie : movies) {
            if (movie.getTitle() != null && movie.getTitle().toLowerCase().contains(lowerCaseKeyword)) {
                results.add(movie);
            }
        }

        if (results.isEmpty()) {
            System.out.println("Không tìm thấy bộ phim nào với từ khóa: \"" + titleKeyword + "\"");
        } else {
            System.out.println("Tìm thấy " + results.size() + " bộ phim với từ khóa: \"" + titleKeyword + "\"");
        }

        return results;
    }

    public void payment(Ticket ticket) {
        System.out.println("Processing payment for ticket...");
        System.out.println("Amount: " + ticket.getCost() + " VND");
        System.out.println("Payment successful!");
    }
}
