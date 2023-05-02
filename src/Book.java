public class Book {
    private String title;
    private String content;
    private boolean isBorrowed;
    private User borrower;

    public Book(String title, String content){
        this.title = title;
        this.content = content;
        isBorrowed = false;
        borrower = null;
    }

    public String getTitle(){
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook(User user){
        if (!isBorrowed){
            isBorrowed = true;
            borrower = user;
        } else {
            System.out.println("Booken är redan utlånad av "+ borrower.getName());
        }
    }

    public void returnBook(){
        isBorrowed = false;
        borrower = null;
    }

    public void readBook(){
        System.out.println("Titel "+ title);
        System.out.println(content);
    }

}
