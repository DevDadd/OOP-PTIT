package feature.home.domain;

// Tài khoản người dùng
public class User_account {
    // Attributes
    private int id;
    private String name;
    private String email;
    private String phone;
    private String password;

    private boolean isLoggedIn = false;

    // Constructor
    public User_account() {
    }

    public User_account(int id, String name, String email, String phone, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    // Methods
    public boolean login(String email, String password) {
        if (this.email != null && this.email.equals(email) && this.password.equals(password)) {
            isLoggedIn = true;
            System.out.println("Login successful! Welcome " + name);
            return true;
        }
        System.out.println("Login failed!");
        return false;
    }

    public void logout() {
        if (isLoggedIn) {
            isLoggedIn = false;
            System.out.println("User " + name + " logged out.");
        } else {
            System.out.println("No user is currently logged in.");
        }
    }

    public void sign_up(String name, String email, String phone, String password) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        System.out.println("User registered successfully: " + name);
    }
}
