public class Book
{
    private String title;
    private String author;
    private String language;
    private String genre;
    private String publisher;
    private int releaseYear;
    private long isbn;

    public Book(String title, String author, String language, String genre, String publisher, int releaseYear, long isbn)
    {
        this.title = title;
        this.author = author;
        this.language = language;
        this.genre = genre;
        this.publisher = publisher;
        this.releaseYear = releaseYear;
        this.isbn = isbn;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getLanguage() {
        return language;
    }

    public String getGenre(){
        return genre;
    }

    public String getPublisher(){
        return publisher;
    }

    public int getReleaseYear(){
        return releaseYear;
    }

    public long getIsbn(){
        return isbn;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setLanguage(String language)
    {
        this.language = language;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public void setReleaseYear(int releaseYear)
    {
        this.releaseYear = releaseYear;
    }

    public void setIsbn(long isbn)
    {
        this.isbn = isbn;
    }
}
