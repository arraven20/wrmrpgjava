package data.scenes.directions;

import data.Lock;

import java.io.Serializable;

abstract public class Direction implements Serializable {
    String DESCRIPTION;
    int EXIT;
    Lock lock;

    Direction(String description, int exit, Lock lock){
        this.DESCRIPTION = description;
        this.EXIT = exit;
        this.lock = lock;
    }

    Direction(String description, int exit){
        this.DESCRIPTION = description;
        this.EXIT = exit;
        //this.locked = false;
        this.lock = new Lock();
    }

    public String getDescription(){
        return this.DESCRIPTION;
    }

    public Integer getExit(){
        return this.EXIT;
    }

    public Lock getLock(){ return this.lock; }

}
