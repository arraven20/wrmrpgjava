package data.actors;

import java.io.Serializable;

public class Attributes implements Serializable {
    private int warrior;
    private int rogue;
    private int mage;

    public Attributes(int warrior, int rogue, int mage){
        this.warrior = warrior;
        this.rogue = rogue;
        this.mage = mage;
    }

    public int getWarrior(){ return this.warrior; }

    public int getRogue(){ return this.rogue; }

    public int getMage(){ return this.mage; }

    public void setWarrior(int value){ this.warrior = value; }

    public void setRogue(int value){ this.rogue = value; }

    public void setMage(int value){ this.mage = value; }
}
