/* Nama Anggota Kelompok:
Crystiano Bayu Satya Alves 24060124140130
Caesar Ferdiana Suwandi 24060124120051
Ferdy Prasetya Putra 24060124140145
Ghatfan Muhammad Atiwiar 24060124140171
*/

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

    public String getNomorTiket() {
        return nomorTiket;
    }

    public Date getTanggalBeli() {
        return tanggalBeli;
    }

    public JadwalTayang getJadwal() {
        return jadwal;
    }

    public Kursi getKursi() {
        return kursi;
    }

    public void setNomorTiket(String nomorTiket) {
        this.nomorTiket = nomorTiket;
    }

    public void setTanggalBeli(Date tanggalBeli) {
        this.tanggalBeli = tanggalBeli;
    }

    public void setJadwal(JadwalTayang jadwal) {
        this.jadwal = jadwal;
    }

    public void setKursi(Kursi kursi) {
        this.kursi = kursi;
    }

    @Override
    public void cetakBukti() {
        System.out.println("Tiket: " + getNomorTiket() + " | Film: " + getJadwal().getFilm().getDetail() + " | Kursi: "
                + getKursi().getNomorKursi());
    }

    public String getDetail() {
        return "Tiket " + getNomorTiket() + " | Film: " + getJadwal().getFilm().getDetail() + " | Kursi: " + getKursi().getNomorKursi();
    }
}
