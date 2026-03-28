import java.util.Date;

public class Tiket implements CetakBukti {
    private String nomorTiket;
    private Date tanggalBeli;
    private JadwalTayang jadwal;
    private Kursi kursi;

    public Tiket(String nomorTiket, Date tanggalBeli, JadwalTayang jadwal, Kursi kursi) {
        this.nomorTiket = nomorTiket;
        this.tanggalBeli = tanggalBeli;
        this.jadwal = jadwal;
        this.kursi = kursi;
    }

    @Override
    public void cetakBukti() {
        System.out.println("Tiket: " + nomorTiket + " | Film: " + jadwal.getFilm().getDetail() + " | Kursi: "
                + kursi.getNomorKursi());
    }

    public String getDetail() {
        return "Tiket " + nomorTiket +
                " | Film: " + jadwal.getFilm().getDetail() +
                " | Kursi: " + kursi.getNomorKursi();
    }
}
