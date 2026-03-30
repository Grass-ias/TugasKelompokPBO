public class Transaksi {
    private String nomorTransaksi;
    private double totalHarga;
    private String status;
    private String metodePembayaran;
    private Tiket tiket;
    private Pelanggan pelanggan;

    public Transaksi(String nomorTransaksi, double totalHarga, String status, String metodePembayaran, Tiket tiket,
            Pelanggan pelanggan) {
        if (totalHarga <= 0) {
            throw new ExeptionHargaTidakValid("Total harga transaksi harus lebih dari 0");
        }
        if (pelanggan == null) {
            throw new IllegalArgumentException("Pelanggan tidak boleh null");
        }
        if (tiket == null) {
            throw new IllegalArgumentException("Tiket tidak boleh null");
        }
        assert totalHarga > 0 : "Total harga harus positif";
        this.nomorTransaksi = nomorTransaksi;
        this.totalHarga = totalHarga;
        this.status = status;
        this.metodePembayaran = metodePembayaran;
        this.tiket = tiket;
        this.pelanggan = pelanggan;
    }

    public String getNomorTransaksi() {
        return nomorTransaksi;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public String getStatus() {
        return status;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public Tiket getTiket() {
        return tiket;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setNomorTransaksi(String nomorTransaksi) {
        this.nomorTransaksi = nomorTransaksi;
    }

    public void setTotalHarga(double totalHarga) {
        if (totalHarga <= 0) {
            throw new ExeptionHargaTidakValid("Total harga transaksi harus lebih dari 0");
        }
        this.totalHarga = totalHarga;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    public void setTiket(Tiket tiket) {
        this.tiket = tiket;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public boolean proses() {
        System.out.println("Memproses pembayaran via " + this.metodePembayaran + " untuk " + pelanggan.getNama());
        this.status = "Lunas";
        return true;
    }

    public void batalkan() {
        System.out.println("Transaksi " + this.nomorTransaksi + " dibatalkan.");
        this.status = "Dibatalkan";
    }

    public void cetakStruk() {
        System.out.println("No. Transaksi : " + this.nomorTransaksi);
        System.out.println("Pelanggan     : " + this.pelanggan.getNama());
        if (this.tiket != null) {
            System.out.println("Tiket         : " + this.tiket.getDetail());
        }
        System.out.println("Total Bayar   : Rp" + this.totalHarga);
        System.out.println("Pembayaran    : " + this.metodePembayaran);
        System.out.println("Status        : " + this.status);
    }
}
