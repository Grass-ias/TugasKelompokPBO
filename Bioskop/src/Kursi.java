public class Kursi {
    private String nomorKursi;
    private char baris;
    private String status; // "AVAILABLE" / "BOOKED"

    public Kursi(String nomorKursi, char baris) {
        this.nomorKursi = nomorKursi;
        this.baris = baris;
        this.status = "AVAILABLE";
    }

    public boolean isAvailable() {
        return status.equals("AVAILABLE");
    }

    public void setBooked() {
        this.status = "BOOKED";
    }

    public String getNomorKursi() {
        return nomorKursi;
    }
}
