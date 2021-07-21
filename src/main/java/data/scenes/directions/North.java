package data.scenes.directions;

import data.Lock;

public class North extends Direction {

    public North(String description, int exit, Lock lock){
        super(description, exit, lock);
    }

    public North(String description, int exit){
        super(description, exit);
    }
}
