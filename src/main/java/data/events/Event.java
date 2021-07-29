package data.events;

import data.actors.Actor;

import java.io.Serializable;

public class Event implements Serializable {

    private String eventType;
    private Actor combatant;
    private boolean active;

    public Event(String eventType, Actor combatant){
        this.eventType = eventType;
        this.combatant = combatant;
        this.active = true;
    }

    public Event(String eventType){
        this.eventType = eventType;
    }

    public static Event noEvent(){
        return new Event("none");
    }

    public void setActive(){ this.active = true; }

    public void setInactive(){ this.active = false; }

    public String getEventType(){ return this.eventType; }

    public Actor getCombatant(){ return this.combatant; }

}
