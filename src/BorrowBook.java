public class BorrowBook {
    private Book[] books;
    public User[] users;

    public BorrowBook(Book[] books, User[] users){
        this.books = books;
        this.users = users;
    }

    public boolean borrowBook(int bookIndex, int userIndex) {
        if (bookIndex < 0 || bookIndex >= books.length) {
            System.out.println("Invalid book index");
            return false;
        }

        Book book = books[bookIndex];
        if (book.isBorrowed()) {
            System.out.println("Boken är redan utlånad");
            return false;
        }

        if (userIndex < 0 || userIndex >= users.length) {
            System.out.println("Invalid user index");
            return false;
        }

        User user = users[userIndex];
        book.borrowBook(user);
        System.out.println(book.getTitle() + " är lånad av " + user.getName());
        return true;
    }

    public boolean returnBook(int bookIndex) {
        if (bookIndex < 0 || bookIndex >= books.length) {
            System.out.println("Invalid book index");
            return false;
        }

        Book book = books[bookIndex];
        if (!book.isBorrowed()) {
            System.out.println("Boken är inte utlånad");
            return false;
        }

        book.returnBook();
        System.out.println(book.getTitle() + " är tillbaka lämnad");
        return true;
    }

}
