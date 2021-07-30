package Week3.Interfaces.Books;

public class EBook implements Book {
    private int numberOfPages;
    private String author;
    private String genre;
    private int size;

    public EBook(int numberOfPages, String author, String genre, int size) {
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.genre = genre;
        this.size = size;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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
