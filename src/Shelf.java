public class Shelf
{
    static int IDC = 0;

    private Book[] books;
    private int ID;

    public Shelf()
    {
        this.books = null;
        this.ID = IDC++;
    }

    public void add(String title, String author, String language, String genre, String publisher, int releaseYear, int isbn)
    {
        Book newBook = new Book(title, author, language, genre, publisher, releaseYear, isbn);
        Book[] tempBooks = new Book[books.length+1];

        for (int i = 0; i < tempBooks.length; i++) {
            tempBooks[i] = books[i];
        }
        tempBooks[books.length] = newBook;
        books = tempBooks;
    }

    public Book[] superGet()
    {
        return books;
    }

    public void remove(int number)
    {

    }

    public void remove(String word)
    {

    }
}