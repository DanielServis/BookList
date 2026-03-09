public class Shelf
{
    Book[] books;

    public Shelf()
    {
        this.books = null;
    }

    public void add(String title, String author, String language, String genre, String publisher, int releaseYear, int isbn) {
        Book newBook = new Book(title, author, language, genre, publisher, releaseYear, isbn);
        Book[] tempBooks = new Book[books.length+1];

        for (int i = 0; i < tempBooks.length; i++) {
            tempBooks[i] = books[i];
        }
        tempBooks[books.length] = newBook;
        books = tempBooks;
    }

    public void remove(int number)
    {

    }

    public void remove(String word)
    {

    }
}
