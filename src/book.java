import java.util.List;

public class book {
    private String title;
    private double height;
    private double width;
    private double depth;

    public book(String title, double height, double width, double depth) {
        this.title = title;
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public String getTitle() {
        return title;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public static <bookshelf> void main(String[] args) {
        book book1 = new book("The Lord of the Rings", 20.5, 15.5, 5.0);
        book book2 = new book("To Kill a Mockingbird", 18.0, 13.0, 3.5);
        book book3 = new book("Pride and Prejudice", 16.5, 12.0, 3.0);
        book book4 = new book("1984", 21.0, 16.0, 5.5);
        book book5 = new book("The Catcher in the Rye", 17.5, 14.5, 4.0);

        bookshelf bookshelf = new bookshelf();
        bookshelf.add book(book1);
        bookshelf.add book(book2);
        bookshelf.add book(book3);
        bookshelf.add book(book4);
        bookshelf.add book(book5);

        List<book> books = bookshelf.getbooks();
        for (book book : books) {
            System.out.println(book.getTitle() + ": " + book.getHeight() + "cm");
        }
    }
}
