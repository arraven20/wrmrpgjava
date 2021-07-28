package data.items;

public class CreateItems {

    public static Weapon axe(){
        String[] axeSkills = {"axe"};
        return new Weapon("axe", "description of axe", 5, axeSkills, new Damage(1));
    }

}
