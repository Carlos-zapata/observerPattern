package mx.iteso.observer.impl;

import mx.iteso.observer.Observer;
import mx.iteso.observer.Scorers;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;

public class ScoresDataTest {
    ScoresData scoresData;
    Observer observer;
    Scorers scorer;
    ArrayList<Scorers> scorers;

    @Before
    public void setUp() {
        scoresData = new ScoresData();
        scorers = new ArrayList<Scorers>();
        observer = mock(Observer.class);
        scorer = mock(Scorers.class);
    }

    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testRegisterAndRemoveObserverFailure() {
        scoresData.registerObserver(observer);
        scoresData.removeObserver(observer);
        scoresData.removeObserver(observer);
    }

    @Test
    public void testAddScorer() {
        scoresData.addScorer(scorer);
    }
}
