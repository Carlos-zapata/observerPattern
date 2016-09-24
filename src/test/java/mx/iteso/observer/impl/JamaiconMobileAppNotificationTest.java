package mx.iteso.observer.impl;

import mx.iteso.observer.Scorers;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;

/**
 * Created by Jorge on 9/24/2016.
 */
public class JamaiconMobileAppNotificationTest {
    private JamaiconMobileAppNotifications jamaiconMobileAppNotifications;
    private ScoresData scoresData;
    private boolean notificationsOn;
    ArrayList<Scorers> scorers;


    @Before
    public void setUp(){
        scoresData = mock(ScoresData.class);
        jamaiconMobileAppNotifications = new JamaiconMobileAppNotifications(scoresData);
        scorers = new ArrayList<Scorers>();
    }

    @Test
    public void turnNotificationsOnTest(){
        jamaiconMobileAppNotifications.turnNotificationsOn();
    }

    @Test
    public void turnNotificationsOffTest(){
        jamaiconMobileAppNotifications.turnNotificationsOff();
    }

    @Test
    public void testUpdate() {
     jamaiconMobileAppNotifications.update("homeTeam", "awayTeam", 1, 0, scorers);
     scoresData.setScore("homeTeam", "awayTeam", 1, 0);
        //Nothing to assert or verify for now
    }



}
