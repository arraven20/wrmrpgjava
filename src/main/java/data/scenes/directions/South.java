package data.scenes.directions;

import data.Lock;

public class South extends Direction{
    public South(String description, int exit, Lock lock){
        super(description, exit, lock);
    }

    public South(String description, int exit){
        super(description, exit);
    }
}
