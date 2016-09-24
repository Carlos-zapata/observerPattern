package mx.iteso.observer;

/**
 * Created by Carlos Flores on 22/09/2016.
 */
public class Scorers {

    private String name;
    private int number;
    private String position;
    private String team;

    public Scorers(String name, int number, String position, String team){
        this.name = name;
        this.number = number;
        this.position = position;
        this.team = team;
    }

    public String getName(){
        return this.name;
    }
    public int getNumber(){
        return this.number;
    }
    public String getPosition(){
        return this.position;
    }
    public String getTeam(){
        return this.team;
    }
}
