package data.events;

import core.Engine;

public class Combat {

    // 1.determine initiative
    // 2.attack rounds

    public static boolean playerHasInitiative(){
        return Engine.getActorInitiative(Engine.getPlayer()) > Engine.getActorInitiative(Engine.getActiveOpponent());
    }

}
