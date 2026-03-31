/* Nama Anggota Kelompok:
Crystiano Bayu Satya Alves 24060124140130
Caesar Ferdiana Suwandi 24060124120051
Ferdy Prasetya Putra 24060124140145
Ghatfan Muhammad Atiwiar 24060124140171
*/

public class Admin extends Akun implements CetakBukti {
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

    @Override
    public void cetakBukti() {
        System.out.println("Bukti oleh Admin: " + getUsername());
    }
}
