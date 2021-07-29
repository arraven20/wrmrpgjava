package data.items;

public class CreateItems {

    public static Weapon axe(){
        String[] axeSkills = {"axe"};
        return new Weapon("axe", "description of axe", 5, axeSkills, new Damage(1));
    }

    public static Weapon dagger(){
        String[] daggerSkills = {"daggers", "thrown"};
        return new Weapon("dagger", "dagger description", 2, daggerSkills,
                new Damage(1, "-", 2));
    }

}
