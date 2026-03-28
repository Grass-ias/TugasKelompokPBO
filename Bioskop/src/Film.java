public class Film {
    private String judulFilm;
    private String genre;
    private int durasi;
    private String rating;

    public Film(String judulFilm, String genre, int durasi, String rating) {
        this.judulFilm = judulFilm;
        this.genre = genre;
        this.durasi = durasi;
        this.rating = rating;
    }

    public String getJudulFilm() {
        return judulFilm;
    }

    public void setJudulFilm(String judulFilm) {
        this.judulFilm = judulFilm;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
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