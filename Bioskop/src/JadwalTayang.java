import java.util.Date;
import java.sql.Time;
import java.util.List;

public class JadwalTayang {
    private Date tanggal;
    private Time jamMulai;
    private double harga;
    private List<Kursi> kursiList;

    public JadwalTayang(Date tanggal, Time jamMulai, double harga, List<Kursi> kursiList) {
        this.tanggal = tanggal;
        this.jamMulai = jamMulai;
        this.harga = harga;
        this.kursiList = kursiList;
    }

    public int getSisaKursi() {
        int count = 0;
        for (Kursi k : kursiList) {
            if (k.isAvailable()) count++;
        }
        return count;
    }
}