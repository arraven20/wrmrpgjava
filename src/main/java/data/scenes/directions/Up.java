package data.scenes.directions;

import data.Lock;

public class Up extends Direction{
    public Up(String description, int exit, Lock lock){
        super(description, exit, lock);
    }

    public Up(String description, int exit){
        super(description, exit);
    }
}
