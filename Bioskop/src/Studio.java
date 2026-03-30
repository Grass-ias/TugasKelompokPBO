import java.util.List;
import java.util.ArrayList;

public class Studio {
    private String namaStudio;
    private int kapasitas;
    private List<Kursi> kursiList;

    public Studio(String namaStudio, int kapasitas) {
        if (namaStudio == null || namaStudio.trim().isEmpty()) {
            throw new ExeptionNamaTidakValid("Nama studio tidak boleh null atau kosong");
        }
        if (kapasitas <= 0) {
            throw new ExeptionKapasitasTidakValid("Kapasitas studio harus lebih dari 0");
        }
        assert kapasitas > 0 : "Kapasitas harus positif";
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
        if (namaStudio == null || namaStudio.trim().isEmpty()) {
            throw new ExeptionNamaTidakValid("Nama studio tidak boleh null atau kosong");
        }
        this.namaStudio = namaStudio;
    }

    public void setKapasitas(int kapasitas) {
        if (kapasitas <= 0) {
            throw new ExeptionKapasitasTidakValid("Kapasitas studio harus lebih dari 0");
        }
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

    public void tampilInfoStudio() {
        System.out.println("Nama Studio     : " + this.namaStudio);
        System.out.println("Kapasitas Total : " + this.kapasitas + " kursi");
        System.out.println("Kursi Tersedia  : " + getKursiTersedia().size() + " kursi");
    }

}
