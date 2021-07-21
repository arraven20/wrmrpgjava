package data;

public class Lock {

    boolean locked;
    String key;


    public Lock(boolean locked, String key){
        this.locked = locked;
        this.key = key;
    }

    public Lock(){
        this.locked = false;
        this.key = "";
    }

    public boolean isLocked(){ return this.locked; }

}
