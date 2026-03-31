/* Nama Anggota Kelompok:
Crystiano Bayu Satya Alves 24060124140130
Caesar Ferdiana Suwandi 24060124120051
Ferdy Prasetya Putra 24060124140145
Ghatfan Muhammad Atiwiar 24060124140171
*/

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

    public void tampilProfil() {
        System.out.println("Username     : " + this.username);
        System.out.println("Nama Lengkap : " + this.nama);
        System.out.println("No. HP       : " + this.noHP);
        System.out.println("Email        : " + this.email);
        System.out.println("Total Order  : " + this.riwayatTransaksi.size() + " kali transaksi");
    }
}