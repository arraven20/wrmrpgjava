package data.scenes.directions;

import data.Lock;

public class West extends Direction{
    public West(String description, int exit, Lock lock){
        super(description, exit, lock);
    }

    public West(String description, int exit){
        super(description, exit);
    }
}
