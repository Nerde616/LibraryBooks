//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Book book1 = new Book("Java Programming", "James Gosling", "978-0134685991");
       Book book2 = new Book("Harry Potter and the Chamber of Secrets", "JK Rowling", "223-24323245");
       Book book3 = new Book("The Wizard and the Glass", "Stephen King", "123- 343564542");
       Book book4 = new Book("Last Shot", "Lee Child", "787-1938567438");
       Book book5 = new Book("Double Cross", "James Patterson", "643=294856537");


     book1.displayBookDetails();
    }
}