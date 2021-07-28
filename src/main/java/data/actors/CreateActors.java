package data.actors;

import data.items.CreateItems;

public class CreateActors {

    public static Actor createInitialPlayer(){

        Actor player = new Actor(0, "test player", "human");
        player.setAttributes(new Attributes(3, 3,3));
        player.setHealth();
        player.calculateAndSetDefense();
        player.setCurrentSceneId(1);
        player.setWeapon(CreateItems.axe());

        return player;
    }

    public static Actor bandit(){
        Actor bandit = new Actor(1, "bandit", "human");
        bandit.setAttributes(new Attributes(5, 3, 2));
        bandit.setHealth();
        bandit.calculateAndSetDefense();

        return bandit;
    }
}
