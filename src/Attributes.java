import java.util.Scanner;
public class Attributes {
    Book[] books = new Book[4];
    books[0] = new Book("Bok 1", "Innehåll av bok 1");
    books[1] = new Book("Bok 2", "Innehåll av bok 2");
    books[2] = new Book("Bok 3", "Innehåll av bok 3");
    books[3] = new Book("Bok 4", "Innehåll av bok 4");

    User[] users = new User[2];
    users[0] = new User("GurraG");
    users[1] = new User("Broder");

    BorrowBook borrowBook = new BorrowBook(books, users);

    Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.println("1. Borrow book");
        System.out.println("2. Return book");
        System.out.println("3. Read book");
        System.out.println("4. Exit");
        System.out.print("Enter");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter book index: ");
                int bookIndex = scanner.nextInt();
                System.out.print("Enter user index: ");
                int userIndex = scanner.nextInt();
                borrowBook.borrowBook(bookIndex, userIndex);
                break;
            case 2:
                System.out.print("Enter book index: ");
                bookIndex = scanner.nextInt();
                borrowBook.returnBook(bookIndex);
                break;
            case 3:
                System.out.print("Enter book index: ");
                bookIndex = scanner.nextInt();
                books[bookIndex].readBook();
                break;
            case 4:
                scanner.close();
                return;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

}
