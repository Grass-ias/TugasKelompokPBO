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

    public String getDetail() {
        return judulFilm + " (" + genre + ", " + durasi + " menit, Rating: " + rating + ")";
    }
}