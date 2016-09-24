package mx.iteso.observer;

import mx.iteso.observer.impl.JamaiconMobileAppNotifications;
import mx.iteso.observer.impl.ScoresData;
import mx.iteso.observer.impl.StoreMonitorDisplay;

public class NewsStation {
    public static void main( String[] args ){
        ScoresData scoresData;
        scoresData = new ScoresData();

        StoreMonitorDisplay storeMonitorDisplay = new StoreMonitorDisplay(scoresData);
        JamaiconMobileAppNotifications jamaiconMobileAppNotifications = new JamaiconMobileAppNotifications(scoresData);

        jamaiconMobileAppNotifications.turnNotificationsOff();

        scoresData.addScorer(new Scorers("Carlos Flores", 10, "Striker", "Intel"));
        scoresData.setScore("Tacit Knowledge", "Intel", 8, 1);

        scoresData.addScorer(new Scorers("Juan Alfredo", 4, "Medio", "Chivas"));
        scoresData.setScore("Chivas", "Queretaro", 2, 1);

        scoresData.addScorer(new Scorers("Pepe El Toro", 7, "Portero", "La Ganga"));
        scoresData.setScore("La Ganga", "Muebles America", 0, 0);
    }
}
