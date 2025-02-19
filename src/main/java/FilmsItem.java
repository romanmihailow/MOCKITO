public class FilmsItem {
    private int id;
    private String name;
    private String genre;
    private int year;
    private int boxOfficee;

    public FilmsItem(int id, String name, String genre, int year, int boxOfficee) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.boxOfficee = boxOfficee;
    }

    public int getId() {
        return id;
    }

    public int getBoxOfficee() {
        return boxOfficee;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
