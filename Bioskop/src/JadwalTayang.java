/* Nama Anggota Kelompok:
Crystiano Bayu Satya Alves 24060124140130
Caesar Ferdiana Suwandi 24060124120051
Ferdy Prasetya Putra 24060124140145
Ghatfan Muhammad Atiwiar 24060124140171
*/

import java.util.Date;
import java.sql.Time;

public class JadwalTayang {
    private Date tanggal;
    private Time jamMulai;
    private double harga;
    private Film film;
    private Studio studio;

    public JadwalTayang(Date tanggal, Time jamMulai, double harga, Film film, Studio studio) {
        if (harga <= 0) {
            throw new ExeptionHargaTidakValid("Harga tiket harus lebih dari 0");
        }
        if (film == null) {
            throw new IllegalArgumentException("Film tidak boleh null");
        }
        if (studio == null) {
            throw new IllegalArgumentException("Studio tidak boleh null");
        }
        assert harga > 0 : "Harga harus positif";
        this.tanggal = tanggal;
        this.jamMulai = jamMulai;
        this.harga = harga;
        this.film = film;
        this.studio = studio;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public Time getJamMulai() {
        return jamMulai;
    }

    public double getHarga() {
        return harga;
    }

    public Film getFilm() {
        return film;
    }

    public Studio getStudio() {
        return studio;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public void setJamMulai(Time jamMulai) {
        this.jamMulai = jamMulai;
    }

    public void setHarga(double harga) {
        if (harga <= 0) {
            throw new ExeptionHargaTidakValid("Harga tiket harus lebih dari 0");
        }
        this.harga = harga;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    public int getSisaKursi() {
        return studio.getKursiTersedia().size();
    }

    public void tampilInfoJadwal() {
        System.out.println("Film   : " + this.film.getDetail());
        System.out.println("Waktu  : " + this.tanggal + " | " + this.jamMulai);
        System.out.println("Studio : " + this.studio.getNamaStudio() + " (Sisa kursi: " + getSisaKursi() + ")");
        System.out.println("Harga  : Rp" + this.harga);
    }
}
