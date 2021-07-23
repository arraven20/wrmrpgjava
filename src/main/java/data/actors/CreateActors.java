package data.actors;

public class CreateActors {

    public static Actor createInitialPlayer(){

        Actor player = new Actor(0, "test player", "human");
        player.setAttributes(new Attributes(3, 3,3));
        player.setHealth();
        player.calculateAndSetDefense();

        return player;
    }
}
