import java.util.Date;
import java.sql.Time;
import java.util.List;

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

    public int getSisaKursi() {
        return studio.getKursiTersedia().size();
    }

    public Film getFilm() {
        return film;
    }

    public double getHarga() {
        return harga;
    }
}
