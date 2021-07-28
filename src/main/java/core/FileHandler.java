package core;

import data.actors.Actor;
import data.scenes.Scene;

import java.io.*;
import java.util.HashMap;

public class FileHandler {

    private static final String SCENE_FILE = "src/main/java/files/scenes.txt";
    private static final String PLAYER_FILE = "src/main/java/files/player.txt";


    public static void createFile(String filePath){
        try {
            File myObj = new File(filePath);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists: " + myObj.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void writeScenes(HashMap<Integer, Scene> scenes) throws IOException{
        createFile(SCENE_FILE);
        File file = new File(SCENE_FILE);
        FileOutputStream f = new FileOutputStream(file);
        ObjectOutputStream s = new ObjectOutputStream(f);
        s.writeObject(scenes);
        s.close();
    }

    public static void writePlayer(Actor pc) throws IOException{
        createFile(PLAYER_FILE);
        File file = new File(PLAYER_FILE);
        FileOutputStream f = new FileOutputStream(file);
        ObjectOutputStream s = new ObjectOutputStream(f);
        s.writeObject(pc);
        s.close();
    }

    public static HashMap<Integer, Scene> readScenes() throws IOException, ClassNotFoundException {
        File file = new File(SCENE_FILE);
        FileInputStream f = new FileInputStream(file);
        ObjectInputStream s = new ObjectInputStream(f);
        HashMap<Integer, Scene> scenes = (HashMap<Integer, Scene>) s.readObject();
        s.close();
        return scenes;
    }

    public static Actor readPlayer() throws IOException, ClassNotFoundException {
        File file = new File(PLAYER_FILE);
        FileInputStream f = new FileInputStream(file);
        ObjectInputStream s = new ObjectInputStream(f);
        Actor player = (Actor) s.readObject();
        s.close();
        return player;
    }
}
