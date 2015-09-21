package RPC;

import java.util.*;


/**
 * Created by thaonzo on 21/09/2015.
 */
public class Joueur {
    private String nom;
    private int score;
    private Stack<RPSEnum> movements;

    public Joueur(String nom, Stack<RPSEnum> mouv){
        this.nom = nom;
        this.movements = mouv;
        this.score = 0;
    }
    public Joueur(String nom){
        this.nom = nom;

        Random rand = new Random();
        Stack<RPSEnum> coll = new Stack();
        for(int i=0;i<10;i++)
            coll.push(RPSEnum.values()[rand.nextInt()%3]);

        this.movements = coll;
        this.score=0;
    }

    //Getters
    public String getNom(){
        return this.nom;
    }
    public int getScore(){
        return this.score;
    }
    public int getNbMouv(){
        return this.movements.size();
    }
    public RPSEnum getNextMv(){
        return this.movements.pop();
    }


    //Setters
    public void setScore(int score){
        this.score=score;
    }


}
