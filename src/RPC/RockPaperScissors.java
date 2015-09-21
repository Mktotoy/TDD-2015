package RPC;

/**
 * Created by thaonzo on 14/09/2015.
 */
public class RockPaperScissors {



    public RockPaperScissors(){

    }

    public Result play(RPSEnum p1,RPSEnum p2){
        if (p1 == p2)
                return Result.TIE;

        if ((p1 == RPSEnum.PAPER) && (p2 == RPSEnum.SCISSORS) ){
            return Result.LOST;
        }
        if((p1 == RPSEnum.PAPER) && (p2 == RPSEnum.ROCK) ){
            return Result.WIN;
        }

        if((p1==RPSEnum.ROCK) && (p2 == RPSEnum.SCISSORS) ){
            return Result.WIN;
        }
        if((p1 == RPSEnum.ROCK) && (p2 == RPSEnum.PAPER) ){
            return Result.LOST;
        }

        if((p1 == RPSEnum.SCISSORS) && (p2 == RPSEnum.ROCK) ){
            return Result.LOST;
        }
        if((p1 == RPSEnum.SCISSORS) && (p2 == RPSEnum.PAPER) ){
            return Result.WIN;
        }
        else
            return Result.LOST;
    }

    public Result play(Joueur J1,Joueur J2){
        return Result.LOST;
    }
}
