public class Book
{
    private String title;
    private String author;
    private String language;
    private String genre;
    private String publisher;
    private int releaseYear;
    private int isbn;

    public Book(String title, String author, String language, String genre, String publisher, int releaseYear, int isbn)
    {
        this.title = title;
        this.author = author;
        this.language = language;
        this.genre = genre;
        this.publisher = publisher;
        this.releaseYear = releaseYear;
        this.isbn = isbn;
    }
}
