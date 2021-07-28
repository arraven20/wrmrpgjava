package data.items;

import java.io.Serializable;

public abstract class Item implements Serializable {

    private final String name;
    private final String description;
    private final int value;

    public Item(String name, String description, int value){
        this.name = name;
        this.description = description;
        this.value = value;
    }


}
