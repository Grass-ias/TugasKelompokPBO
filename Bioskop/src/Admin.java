public class Admin extends Akun {
    private String level;

    public Admin(String id, String username, String password, String email, String level) {
        super(id, username, password, email);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void tambahFilm() {
        System.out.println("Admin tambah film baru");
    }

    public void kelolaJadwal() {
        System.out.println("Admin mengelola jadwal tayang");
    }

    public void kelolaStudio() {
        System.out.println("Admin mengelola kapasitas dan kursi studio");
    }
}
