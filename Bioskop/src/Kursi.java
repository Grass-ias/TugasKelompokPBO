public class Kursi {
    private String nomorKursi;
    private char baris;
    private String status;

    public Kursi(String nomorKursi, char baris) {
        this.nomorKursi = nomorKursi;
        this.baris = baris;
        this.status = "AVAILABLE";
    }

    public String getNomorKursi() {
        return nomorKursi;
    }

    public char getBaris() {
        return baris;
    }

    public String getStatus() {
        return status;
    }

    public void setBaris(char baris) {
        this.baris = baris;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNomorKursi(String nomorKursi) {
        this.nomorKursi = nomorKursi;
    }

    public void setBooked() {
        this.status = "BOOKED";
    }

    public boolean isAvailable() {
        return status.equals("AVAILABLE");
    }
}
