import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Pelanggan extends Akun {
    private String nama;
    private String noHP;
    private List<Transaksi> riwayatTransaksi;

    public Pelanggan(String id, String username, String password, String email, String nama, String noHP) {
        super(id, username, password, email);
        this.nama = nama;
        this.noHP = noHP;
        this.riwayatTransaksi = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    public Tiket pesanTiket(JadwalTayang jadwal, Kursi kursiDipesan, String nomorTiket) {
        System.out.println(this.nama + " memesan tiket untuk film " + jadwal.getFilm().getJudulFilm());
        kursiDipesan.setBooked();
        return new Tiket(nomorTiket, new Date(), jadwal, kursiDipesan);
    }

    public void tambahRiwayat(Transaksi t) {
        this.riwayatTransaksi.add(t);
    }

    public List<Transaksi> lihatRiwayat() {
        System.out.println("Menampilkan riwayat transaksi milik " + this.nama);
        return this.riwayatTransaksi;
    }
}