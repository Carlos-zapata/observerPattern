import mx.iteso.observer.Scorers;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Created by Jorge on 9/24/2016.
 */

public class ScorersTest {

    Scorers scorers;
    String name = "Name";
    int number = 0;
    String team= "Team";
    String position = "Position";

    @Before
    public void setUp(){
        scorers = new Scorers(name, number ,team, position);
    }

    @Test
    public void getNameTest(){
        assertEquals(name, scorers.getName());
    }

    @Test
    public void getNumberTest(){
        assertEquals(number, scorers.getNumber());
    }

    @Test
    public void getTeamTest(){
        assertEquals(team, scorers.getTeam());
    }

    @Test
    public void getPositionTest(){
        assertEquals(position, scorers.getPosition());
    }
}
