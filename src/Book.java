public class Book {

    public String getName() {
        return name;
    }

    private String name;
    private String genre;
    private String description;
    public String getGenre() {
        return genre;
    }

    public Book(String name, String genre, String description) {
        this.name = name;
        this.genre = genre;
        this.description = description;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
