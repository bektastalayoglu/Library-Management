public class Main {
    public static void main(String[] args) {
        Library vubLib = new Library();
        User user1 = new User("Bektas");
        User user2 = new User("Burak");
        User user3 = new User("Talip");
        User user4 = new User("Yusuf");

        Book book1 = new Book("Book1",  "Adventure", "Adventure Book");
        Book book2 = new Book("Book2",  "Comedy", "Comedy Book");
        Book book3 = new Book("Book3", "Fiction", "Fiction Book");
        Book book4 = new Book("Book4", "Mystery", "Mystery Book");


        vubLib.addUsers(user1);
        vubLib.addUsers(user2);
        vubLib.addUsers(user3);

        vubLib.addBook(book1);
        vubLib.addBook(book2);
        vubLib.addBook(book3);
        vubLib.addBook(book4);

        vubLib.rentBook(user3,book1);
        vubLib.rentBook(user4,book1);

       vubLib.checkAvaliableBooks();
       vubLib.sendMessage(user1);

    }
}