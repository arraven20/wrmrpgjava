package data.actors;

import java.io.Serializable;

public class Health implements Serializable {

    private int max_hp;
    private int hp;
    private int max_mana;
    private int mana;

    public Health(int max_hp, int max_mana){
        this.max_hp = max_hp;
        this.hp = max_hp;
        this.max_mana = max_mana;
        this.mana = max_mana;
    }

    public int getHp(){ return this.hp; }

    public int getMax_hp(){ return this.max_hp; }

    public int getMana(){ return this.mana; }

    public int getMax_mana(){ return this.max_mana; }

    public void setHp(int value){ this.hp = value; }

    public void setMax_hp(int value){ this.max_hp = value; }

    public void setMana(int value){ this.mana = value; }

    public void setMax_mana(int value){ this.max_mana = value; }


}
