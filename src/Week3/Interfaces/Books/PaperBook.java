package Week3.Interfaces.Animals.Books;

public class PaperBook implements Book{
    private int numberOfPages;
    private String author;
    private String genre;

    public PaperBook(int numberOfPages, String author, String genre) {
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.genre = genre;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void browsePages() {

    }
}
