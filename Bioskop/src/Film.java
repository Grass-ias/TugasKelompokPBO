/* Nama Anggota Kelompok:
Crystiano Bayu Satya Alves 24060124140130
Caesar Ferdiana Suwandi 24060124120051
Ferdy Prasetya Putra 24060124140145
Ghatfan Muhammad Atiwiar 24060124140171
*/

public class Film {
    private String judulFilm;
    private String genre;
    private int durasi;
    private String rating;

    public Film(String judulFilm, String genre, int durasi, String rating) {
        if (judulFilm == null || judulFilm.trim().isEmpty()) {
            throw new ExeptionNamaTidakValid("Judul film tidak boleh null atau kosong");
        }
        if (genre == null || genre.trim().isEmpty()) {
            throw new ExeptionNamaTidakValid("Genre film tidak boleh null atau kosong");
        }
        if (durasi <= 0) {
            throw new ExeptionDurasiTidakValid("Durasi film harus lebih dari 0 menit");
        }
        assert durasi > 0 : "Durasi harus positif";
        this.judulFilm = judulFilm;
        this.genre = genre;
        this.durasi = durasi;
        this.rating = rating;
    }

    public String getJudulFilm() {
        return judulFilm;
    }

    public void setJudulFilm(String judulFilm) {
        if (judulFilm == null || judulFilm.trim().isEmpty()) {
            throw new ExeptionNamaTidakValid("Judul film tidak boleh null atau kosong");
        }
        this.judulFilm = judulFilm;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (genre == null || genre.trim().isEmpty()) {
            throw new ExeptionNamaTidakValid("Genre film tidak boleh null atau kosong");
        }
        this.genre = genre;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        if (durasi <= 0) {
            throw new ExeptionDurasiTidakValid("Durasi film harus lebih dari 0 menit");
        }
        this.durasi = durasi;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDetail() {
        return judulFilm + " (" + getGenre() + ", " + getDurasi() + " menit, Rating: " + getRating() + ")";
    }
}
