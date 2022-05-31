package academy.learningProgramming;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    //Constructor.


    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "sword";
    }

    //getters and setters.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }



    //Override toString method.


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    //methods to implement.

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);//easy way to int cast to string.
        values.add(2, "" + this.strength);
        values.add(3, "" + this.weapon);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {

        if(savedValues != null && savedValues.size() != 0){

            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }

    }
}
