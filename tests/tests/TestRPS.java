package tests;

import RPC.*;
import org.testng.annotations.*;
import static org.testng.Assert.*;

/**
 * Created by thaonzo on 14/09/2015.
 */
public class TestRPS {

    private RockPaperScissors rps;

    @BeforeClass
    public void setUp() throws Exception {
        rps=new RockPaperScissors();

    }

    @AfterClass
    public void tearDown() throws Exception {
        rps=null;
    }

    @DataProvider(name="windata")
    public Object [][] createTestDataWin() {
        return new Object[][] {
                {"PAPER", "ROCK"},
                {"ROCK",  "SCISSORS"},
                {"SCISSORS",  "PAPER"}
        } ;
    }
    @DataProvider(name="lostdata")
    public Object [][] createTestDataLost() {
        return new Object[][] {
                {"SCISSORS", "ROCK"},
                {"PAPER",  "SCISSORS"},
                {"ROCK",  "PAPER"}
        } ;
    }

    @DataProvider(name="tiedata")
    public Object [][] createTestDataTie() {
        return new Object[][] {
                {"SCISSORS", "SCISSORS"},
                {"PAPER",  "PAPER"},
                {"ROCK",  "ROCK"}
        } ;
    }


    @Test(dataProvider = "windata")
    public void testWinPlay(String p1, String p2) throws Exception {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.WIN);
    }


    @Test(dataProvider = "tiedata")
    public void testTiePlay(String p1, String p2) throws Exception {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.TIE);
    }


    @Test(dataProvider = "lostdata")
    public void testLostPlay(String p1, String p2) throws Exception {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.LOST);
    }
}