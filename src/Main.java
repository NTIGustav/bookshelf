import java.awt.print.Book;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        new Attributes();
        new Book();

        Attributes attributes = new Attributes();
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
                    attributes.borrowBook.borrowBook(bookIndex, userIndex);
                    break;
                case 2:
                    System.out.print("Enter book index: ");
                    bookIndex = scanner.nextInt();
                    attributes.borrowBook.returnBook(bookIndex);
                    break;
                case 3:
                    System.out.print("Enter book index: ");
                    bookIndex = scanner.nextInt();
                    attributes.books[bookIndex].readBook();
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
}
