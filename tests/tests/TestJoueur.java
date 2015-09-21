package tests;

import RPC.Joueur;

import RPC.RPSEnum;
import RPC.Result;
import RPC.RockPaperScissors;
import org.testng.annotations.*;

import java.util.Stack;

import static org.testng.Assert.*;

/**
 * Created by thaonzo on 21/09/2015.
 */
public class TestJoueur {

    private RockPaperScissors rps;
    private Stack<RPSEnum> s1,s2;
    private Joueur J1,J2;


    @BeforeClass
    public void setUp() throws Exception {
        rps=new RockPaperScissors();
        s1=new Stack<RPSEnum>();
            s1.push(RPSEnum.PAPER);
            s1.push(RPSEnum.PAPER);
            s1.push(RPSEnum.PAPER);
            s1.push(RPSEnum.PAPER);
            s1.push(RPSEnum.PAPER);
            s1.push(RPSEnum.PAPER);
            s1.push(RPSEnum.PAPER);
            s1.push(RPSEnum.PAPER);
            s1.push(RPSEnum.PAPER);
            s1.push(RPSEnum.PAPER);

        s2=new Stack<RPSEnum>();
            s2.push(RPSEnum.SCISSORS);
            s2.push(RPSEnum.SCISSORS);
            s2.push(RPSEnum.SCISSORS);
            s2.push(RPSEnum.SCISSORS);
            s2.push(RPSEnum.SCISSORS);
            s2.push(RPSEnum.SCISSORS);
            s2.push(RPSEnum.SCISSORS);
            s2.push(RPSEnum.SCISSORS);
            s2.push(RPSEnum.SCISSORS);
            s2.push(RPSEnum.SCISSORS);


        J1=new Joueur("Bill",s1);
        J2=new Joueur("Thomas",s2);

    }

    @AfterClass
    public void tearDown() throws Exception {
        rps=null;
    }

    @DataProvider(name="winplayer")
    public Object [][] createTestWinPlayer() {
        return new Object[][] {

        } ;
    }

    @Test(dataProvider = "winplayer")
    public void testWinPlay(Joueur J1, Joueur J2) throws Exception {
        assertEquals(rps.play(J1.getNextMv(),J2.), Result.LOST);
    }
}
