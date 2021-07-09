package data.scenes.directions;

abstract public class Direction {
    String DESCRIPTION;
    int EXIT;
    boolean locked;
    String key;

    Direction(String description, int exit){
        this.DESCRIPTION = description;
        this.EXIT = exit;
        this.locked = false;
    }

    public String getDescription(){
        return this.DESCRIPTION;
    }

    public Integer getExit(){
        return this.EXIT;
    }

}
