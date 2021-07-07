package data.scenes;

public class Scene {
    int sceneId;
    String title;
    String description;

    public Scene(int sceneId, String title, String description){
        this.sceneId = sceneId;
        this.title = title;
        this.description = description;
    }

    public int getSceneId(){
        return this.sceneId;
    }

    public String getTitle(){
        return this.title;
    }

    public String getDescription(){
        return this.description;
    }
}


