public class User {
    //Variabel --> klassen definerars
    private String name;

    //Constructor
    public User(String name){
        this.name = name;
    } //Sätter ett värde på konstruktorn

    //Metod
    public String getName(){
        return name;
    }//Getter metoden används vid anropning och tillåter andra klasser att få tillgång till variablen utan orginela värdet

}
