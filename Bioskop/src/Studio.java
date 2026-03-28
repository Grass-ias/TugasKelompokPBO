import java.util.List;
import java.util.ArrayList;

public class Studio {
    private String namaStudio;
    private int kapasitas;
    private List<Kursi> kursiList;

    public Studio(String namaStudio, int kapasitas) {
        this.namaStudio = namaStudio;
        this.kapasitas = kapasitas;
        this.kursiList = new ArrayList<>();
    }

    public String getNamaStudio() {
        return namaStudio;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public List<Kursi> getKursiList() {
        return kursiList;
    }
    
    public void setNamaStudio(String namaStudio) {
        this.namaStudio = namaStudio;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public void setKursiList(List<Kursi> kursiList) {
        this.kursiList = kursiList;
    }

    public void tambahKursi(Kursi kursi) {
        kursiList.add(kursi);
    }

    public List<Kursi> getKursiTersedia() {
        List<Kursi> tersedia = new ArrayList<>();
        for (Kursi k : kursiList) {
            if (k.isAvailable()) {
                tersedia.add(k);
            }
        }
        return tersedia;
    }

}