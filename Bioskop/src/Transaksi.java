public class Transaksi {
    private String nomorTransaksi;
    private double totalHarga;
    private String status;
    private String metodePembayaran;

    public Transaksi(String nomorTransaksi, double totalHarga, String status, String metodePembayaran) {
        this.nomorTransaksi = nomorTransaksi;
        this.totalHarga = totalHarga;
        this.status = status;
        this.metodePembayaran = metodePembayaran;
    }

    public String getNomorTransaksi() {
        return nomorTransaksi;
    }

    public void setNomorTransaksi(String nomorTransaksi) {
        this.nomorTransaksi = nomorTransaksi;
    }
    
    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) { 
        this.totalHarga = totalHarga;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    public boolean proses() {
        System.out.println("Memproses pembayaran via " + this.metodePembayaran);
        this.status = "Lunas";
        return true; 
    }

    public void batalkan() {
        System.out.println("Transaksi " + this.nomorTransaksi + " dibatalkan.");
        this.status = "Dibatalkan";
    }
}