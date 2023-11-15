import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    private List<Book> borrowedBooks;
    private List<User> users;
    public Library() {
        this.books =  new ArrayList<>();
        this.borrowedBooks = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void checkAvaliableBooks() {
        System.out.println("----- Available Books ------");
        for(Book book:this.books) {
            if(!borrowedBooks.contains(book)){
                System.out.println("Book Name:" + book.getName());
                System.out.println("Genre:" + book.getGenre());
                System.out.println("Description:" + book.getDescription());
                System.out.println("---------------------------");
            }
        }
    }

    public void addBook(Book book) {
        if(!this.books.contains(book)){
            this.books.add(book);
        }
        else{
            System.out.println("The book is already added.");
        }

    }

    public void addUsers(User user){
        this.users.add(user);
    }

    public boolean checkUser(User user){
        if(!users.contains(user))
            return false;
        return true;
    }

    public void rentBook(User user, Book book) {
        if(books.contains(book) && checkUser(user)){
            user.borrowBook(book);
            System.out.println(book.getName() + " rented");
            books.remove(book);
        }
        else{
            System.out.println("You can not rent this book ...");
        }
    }

    public void returnBook(User user, Book book) {
        if(user.getBooksBorrowed().contains(book)){
            user.returnBook(book);
            books.add(book);
            System.out.println( book.getName() + " returned");
        }
        else{
            System.out.println("You can not return this book..");
        }

    }

    public void sendMessage(User user) {
        if(!user.getBooksBorrowed().isEmpty()){
            System.out.println("Dear " + user.getName() +
                    ". You have " + user.getBooksBorrowed().size() + " book(s) to return.");
            System.out.print("Books currently in possession: ");
            user.showBorrowedBooks();
        }
        else{
            System.out.println(user.getName() + "does not have any books...");
        }

    }





}
