package mx.iteso.observer.impl;

import mx.iteso.observer.Scorers;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;

import static org.mockito.Mockito.mock;

public class StoreMonitorDisplayTest {
    private StoreMonitorDisplay storeMonitorDisplay;
    private ScoresData scoresData;
    ArrayList<Scorers> scorers;

    @Before
    public void setUp() {
        scoresData = mock(ScoresData.class);
        scorers = new ArrayList<Scorers>();
        storeMonitorDisplay = new StoreMonitorDisplay(scoresData);
    }

    @Test
    public void testUpdate() {
        storeMonitorDisplay.update("homeTeam", "awayTeam", 1, 0, scorers);
    }
}
