package data.actors;

public class CreateActors {

    public Actor createPlayer(){

        Actor player = new Actor(0, "test player", "human");
        player.setAttributes(new Attributes(3, 3,3));
        //player.setHealth();

        return player;
    }
}
