/* Nama Anggota Kelompok:
Crystiano Bayu Satya Alves 24060124140130
Caesar Ferdiana Suwandi 24060124120051
Ferdy Prasetya Putra 24060124140145
Ghatfan Muhammad Atiwiar 24060124140171
*/

public class Kursi {
    private String nomorKursi;
    private char baris;
    private String status;

    public Kursi(String nomorKursi, char baris) {
        if (nomorKursi == null || nomorKursi.trim().isEmpty()) {
            throw new ExeptionKursiTidakValid("Nomor kursi tidak boleh null atau kosong");
        }
        if (!Character.isLetter(baris)) {
            throw new ExeptionKursiTidakValid("Baris kursi harus huruf (A-Z)");
        }
        assert nomorKursi.length() > 0 : "Nomor kursi harus ada";
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
        if (!Character.isLetter(baris)) {
            throw new ExeptionKursiTidakValid("Baris kursi harus huruf (A-Z)");
        }
        this.baris = baris;
    }

    public void setStatus(String status) {
        if (status == null || (!status.equals("AVAILABLE") && !status.equals("BOOKED"))) {
            throw new IllegalArgumentException("Status harus AVAILABLE atau BOOKED");
        }
        this.status = status;
    }

    public void setNomorKursi(String nomorKursi) {
        if (nomorKursi == null || nomorKursi.trim().isEmpty()) {
            throw new ExeptionKursiTidakValid("Nomor kursi tidak boleh null atau kosong");
        }
        this.nomorKursi = nomorKursi;
    }

    public void setBooked() {
        this.status = "BOOKED";
    }

    public boolean isAvailable() {
        return status.equals("AVAILABLE");
    }
}
