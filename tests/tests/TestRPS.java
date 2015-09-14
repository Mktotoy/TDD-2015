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

    @Parameters ({ "paper " ," rock " })
    @Test
    public void testWinPlay(String p1, String p2) throws Exception {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.WIN);
    }

}