public class Akun {
    protected String id;
    protected String username;
    protected String password;
    protected String email;

    public Akun(String id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getId() { 
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean login() {
        System.out.println(this.username + " mencoba login...");
        return true; 
    }

    public void logout() {
        System.out.println(this.username + " telah logout.");
    }
}