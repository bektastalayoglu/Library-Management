import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Book> borrowedBook;

    public User(String name){
        this.name = name;
        this.borrowedBook = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void borrowBook(Book book) {
        this.borrowedBook.add(book);
    }

    public void returnBook(Book book) {
        this.borrowedBook.remove(book);
    }


    public List<Book> getBooksBorrowed() {
        return this.borrowedBook;
    }

    public void showBorrowedBooks(){
        for(Book book : borrowedBook){
            System.out.println(book.getName());
        }
    }

}
