public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean borrowed;

    //Now im making the constructors

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.borrowed = false;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }
    public boolean isBorrowed() {
        return borrowed;
    }
    public void borrowBook() {
        if (!borrowed) {

            borrowed = true;
            System.out.println("You have sucessfully borrowed: " + title);
        } else {
            System.out.println("Sorry, this book is already borrowed.");
        }
    }

    public void returnBook() {
        if (borrowed) {
            borrowed = false;
            System.out.println("You have successfully returned: " + title);
        } else {
            System.out.println("This book was not borrowed.");
        }
    }

    public void displayBookDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("isbn: " + isbn);
        System.out.print("Status: " + (borrowed ? "Borrowed" : "Available"));
    }
}
