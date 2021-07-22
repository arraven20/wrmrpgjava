package data.scenes.directions;

import data.Lock;

public class Down extends Direction{
    public Down(String description, int exit, Lock lock){
        super(description, exit, lock);
    }

    public Down(String description, int exit){
        super(description, exit);
    }
}
