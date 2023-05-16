public class BorrowBook {
    //Variablar --> arrays
    private Book[] books;
    public User[] users;

    //Constructor
    public BorrowBook(Book[] books, User[] users){ // Den tar upp parametrarna och ger dem motsvarande instansvariablar
        this.books = books;
        this.users = users;
    } //Möjligt för instans Borrowbook samt tillhandla hålla listorna

    public boolean borrowBook(int bookIndex, int userIndex) { //Metoden för att låna ut böcker --> tar emot två parametrar
        if (bookIndex < 0 || bookIndex >= books.length) { //Parameter 1
            System.out.println("Invalid book index");
            return false;
        } //Kontrollerar att inmatning är giltigt

        Book book = books[bookIndex];
        if (book.isBorrowed()) {
            System.out.println("Boken är redan utlånad");
            return false;
        }//Kontrollerar om boken redan är utlånad

        if (userIndex < 0 || userIndex >= users.length) {//Parameter 2
            System.out.println("Invalid user index");
            return false;
        }//Kontrollerar att inmatningen är giltigt

        User user = users[userIndex]; //Användaren hämtas
        book.borrowBook(user); //Antropar metoden och gör att den skickar med parametern
        System.out.println(book.getTitle() + " är lånad av " + user.getName()); //Visar att den är utlånad och detta skrivs ut
        return true;
    }

    //Metod för att lämna tillbaka
    public boolean returnBook(int bookIndex) { //Kontrollerar index häller
        if (bookIndex < 0 || bookIndex >= books.length) {
            System.out.println("Invalid book index");
            return false;
        }

        Book book = books[bookIndex]; //lånar isBorrowed om falsk boken är inte utlånad
        if (!book.isBorrowed()) {
            System.out.println("Boken är inte utlånad");
            return false;
        }

        book.returnBook();// Om boken är utlånad anropas returnBook --> ändarar till false och null
        System.out.println(book.getTitle() + " är tillbaka lämnad"); //Skickar ut medelandet om det gick att lämna tillbaka
        return true;
    }

}
