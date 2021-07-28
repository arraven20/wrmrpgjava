package data.items;

import java.io.Serializable;

public class Damage implements Serializable {

    private final int dice;
    private final int bonus;
    private final String bonusType;

    public Damage(int dice, String bonusType, int bonus){
        this.dice = dice;
        this.bonus = bonus;
        this.bonusType = bonusType;
    }

    public Damage(int dice){
        this.dice = dice;
        this.bonus = 0;
        this.bonusType = "+";
    }

    public int getBonus(){ return this.bonus; }

    public String getBonusType(){ return this.bonusType; }

    public int getDice(){ return this.dice; }
}
