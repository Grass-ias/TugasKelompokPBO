import java.util.Date;
import java.sql.Time;

public class JadwalTayang {
    private Date tanggal;
    private Time jamMulai;
    private double harga;
    private Film film;
    private Studio studio;

    public JadwalTayang(Date tanggal, Time jamMulai, double harga, Film film, Studio studio) {
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
}
