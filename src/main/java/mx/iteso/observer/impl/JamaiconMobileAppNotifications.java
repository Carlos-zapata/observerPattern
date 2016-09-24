package mx.iteso.observer.impl;

import mx.iteso.observer.Displayable;
import mx.iteso.observer.Observer;
import mx.iteso.observer.Scorers;
import mx.iteso.observer.Subject;
import java.util.ArrayList;

/**
 * Created by Carlos Flores on 22/09/2016.
 */
public class JamaiconMobileAppNotifications implements Observer, Displayable{
    private String homeTeam;
    private String awayTeam;
    private int homeGoals;
    private int awayGoals;
    private ArrayList<Scorers> scorer;
    private Subject scoresData;
    private boolean notificationsOn = true;

    public JamaiconMobileAppNotifications(Subject scoresData){
        this.scoresData = scoresData;
        this.scoresData.registerObserver(this);
    }

    public void display() {
        if(this.notificationsOn) {
            System.out.println("JAMAICON MOBILE APP NOTIFICATION\nLatest score is:");
            System.out.println(homeTeam + " (HOME) " + homeGoals
                    + " - " + awayTeam + " (AWAY) " + awayGoals + "\n");

            for (Scorers scorers : scorer) {
                System.out.println("Scorer: " + scorers.getName() +
                        " (" + scorers.getNumber() + ")\n" + "Position: " + scorers.getPosition() + "\nTeam: " + scorers.getTeam() + "\n");
            }
        }
    }

    public void turnNotificationsOn()
    {
        this.notificationsOn=true;
    }
    public void turnNotificationsOff()
    {
        this.notificationsOn=false;
    }

    public void update(String home, String away, int homeGoals, int awayGoals, ArrayList<Scorers> scorers) {
        this.homeTeam = home;
        this.awayTeam = away;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        this.scorer = scorers;
        display();
    }

}


