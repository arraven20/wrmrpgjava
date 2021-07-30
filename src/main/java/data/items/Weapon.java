package data.items;

public class Weapon extends Item{

    private final String[] skills;
    private final Damage damage;

    public Weapon(String name, String description, int value, String[] skills, Damage damage) {
        super(name, description, value);
        this.skills = skills;
        this.damage = damage;
    }

    public Damage getDamage(){ return this.damage; }

}
