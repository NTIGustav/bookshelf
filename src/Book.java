public class Book {
    //Variablar
    private String title;
    private String content; //För att lagra innehållet av boken
    private boolean isBorrowed; //Håller koll på om den är utlånad därför är det en boolean
    private User borrower; //Håller koll vilken av 2 users som har lånat boken

    //Konstruktor
    public Book(String title, String content){
        this.title = title;
        this.content = content; //Sätter bara värden på parametrarna när det kommer till instansvariablerna
        isBorrowed = false; //Sätts till false då ingen har lånad boken när den skapas
        borrower = null; //Då ingen har lånat boken än
    }

    public String getTitle(){
        return title;
    } //Getter metod för att retuera när den anropas

    public boolean isBorrowed() {
        return isBorrowed;
    } //Getter metod för att retuera true om boken är utlånad
    public void borrowBook(User user){ //används för att låna ut boken till en användare
        if (!isBorrowed){ //Kontrollerar om boken redan är utlånad
            isBorrowed = true; //Ändrar värdet till true om boken lånas ut
            borrower = user; //Sätter ett värde till den användaren som lånar boken
        } else {
            System.out.println("Booken är redan utlånad av "+ borrower.getName()); //
        }//Om boken redan är ut lånad skrivs detta medelande ^^
    }

    public void returnBook(){ //Detta är när du lämnar tillbaka boken så anropas metoden och isborrowed ändras till baka till false
        isBorrowed = false;
        borrower = null; //Ändrar till baka värdet till 0
    }

    public void readBook(){ //Anropas när du vill läsa så skriver den ut bokens titel sen innehållet av den
        System.out.println("Titel "+ title);
        System.out.println(content);
    }

}
