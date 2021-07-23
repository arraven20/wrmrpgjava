package data.actors;

public class Actor {

    private int id;
    private String name;
    private String type;
    private Attributes attributes;
    private Health health;
    private int defense;
    private int currentSceneId;


    public Actor(int id, String name, String type){
        this.id = id;
        this.name = name;
        this.type = type;
    }



    public void setAttributes(Attributes values){ this.attributes = values; }

    public void setHealth(){
        int max_hp = this.attributes.warrior + 6;
        int max_mana = this.attributes.mage * 2;
        this.health = new Health(max_hp, max_mana);
    }

    public String getName(){ return this.name; }
    public Attributes getAttributes(){ return this.attributes; }

    public Health getHealth(){ return this.health; }


}
