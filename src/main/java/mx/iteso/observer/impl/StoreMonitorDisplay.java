package mx.iteso.observer.impl;

import mx.iteso.observer.Displayable;
import mx.iteso.observer.Observer;
import mx.iteso.observer.Scorers;
import mx.iteso.observer.Subject;
import java.util.ArrayList;

public class StoreMonitorDisplay implements Observer, Displayable {
    private String homeTeam;
    private String awayTeam;
    private int homeGoals;
    private int awayGoals;
    private ArrayList<Scorers> scorer;
    private Subject scoresData;

    public StoreMonitorDisplay(Subject scoresData){
        this.scoresData = scoresData;
        this.scoresData.registerObserver(this);
    }

    public void display() {
        System.out.println("MONITOR NOTIFICATION\nLatest score is:");
        System.out.println(homeTeam + " (HOME) " + homeGoals + " - " + awayTeam + " (AWAY) " + awayGoals + "\n");

         for(Scorers scorers: scorer) {System.out.println("Scorer: " + scorers.getName() +
                 " (" + scorers.getNumber() + ")\n" + "Position: " + scorers.getPosition() + "\nTeam: " +scorers.getTeam()+"\n");}
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
