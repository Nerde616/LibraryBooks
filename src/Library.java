import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    public Library() {
        books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }
    public void removeBook(String isbn) {
        boolean removed = books.removeIf(book -> book.getIsbn().equals(isbn));
        if (removed) {
            System.out.println("Book removed.");
        } else {
            System.out.println("Book not found.");
        }
    }

    public void borrowBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null) {
            book.borrowBook();
        } else {
            System.out.println("Book not found.");
        }
    }

    public void returnBook(String isbn) {
        Book book = findBook(isbn);
        if (book !=null) {
            book.returnBook();
        } else {
            System.out.println("Book not found.");
        }
    }

    private Book findBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public void listBooks(){
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        }else {
            for (Book book : books) {
                book.displayBookDetails();
                System.out.println("-----------------");
            }
        }
    }
}
