package RPC;

/**
 * Created by thaonzo on 14/09/2015.
 */
public enum RPSEnum {
    ROCK("Rock"),PAPER("Paper"),SCISORS("Scisors");

    private final String nom;

    RPSEnum(String nom){
        this.nom=nom;
    }

    public String GetNom(){
        return nom;
    }




}
