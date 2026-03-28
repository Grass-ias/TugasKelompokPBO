import java.util.Date;

public class Tiket implements CetakBukti {
    private String nomorTiket;
    private Date tanggalBeli;

    public Tiket(String nomorTiket, Date tanggalBeli) {
        this.nomorTiket = nomorTiket;
        this.tanggalBeli = tanggalBeli;
    }

    @Override
    public void cetakBukti() {
        System.out.println("Tiket: " + nomorTiket + " | Tanggal: " + tanggalBeli);
    }

    public String getDetail() {
        return "Nomor Tiket: " + nomorTiket + ", Tanggal: " + tanggalBeli;
    }
}