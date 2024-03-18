public class User {
    private static final int idCounter = 0;
    private int id;
    private String username;
    private String email;
    private String password;

    public User(int id, String username, String email, String password) {
        setId(id);
        setUsername(username);
        setEmail(email);
        setPassword(password);
    }
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
