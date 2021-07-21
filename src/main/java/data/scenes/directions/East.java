package data.scenes.directions;

import data.Lock;

public class East extends Direction{
    public East(String description, int exit, Lock lock){
        super(description, exit, lock);
    }

    public East(String description, int exit){
        super(description, exit);
    }

}
