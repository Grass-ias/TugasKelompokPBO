import java.util.ArrayList;
import java.util.List;

public class Pelanggan extends Akun {
    private String nama;
    private String noHP;

    public Pelanggan(String id, String username, String password, String email, String nama, String noHP) {
        super(id, username, password, email);
        this.nama = nama;
        this.noHP = noHP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    public Tiket pesanTiket() {
        System.out.println(this.nama + " sedang memesan tiket.");
        return null;
    }

    public List <Transaksi> lihatRiwayat() { 
        System.out.println("Menampilkan riwayat transaksi milik " + this.nama);
        return new ArrayList<>(); 
    }

}

