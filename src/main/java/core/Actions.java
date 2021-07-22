package core;

import data.scenes.Scene;
import data.scenes.directions.Direction;

public class Actions {


    public static void recieveAction(String userAction){
        String[] actionArray = userAction.split(" ");

        if (actionArray.length == 2){
            String actionType = actionArray[0];
            String action = actionArray[1];
            if (actionType.equals("go")){
                move(action);
            }else{
                System.out.println("cannot go");
            }
        }else{
            Engine.setFeedbackText("actionArray is shorter then 2");
        }

//        for (String a : arrOfStr)
//            System.out.println(a);
    }

    private static void move(String direction){
        Scene currentScene = Engine.getCurrentScene();
        switch (direction) {
            case "north" -> go(currentScene.getNorth(), "north");
            case "south" -> go(currentScene.getSouth(), "south");
            case "east" -> go(currentScene.getEast(), "east");
            case "west" -> go(currentScene.getWest(),"west");
            case "up" -> go(currentScene.getUp(), "up");
            case "down" -> go(currentScene.getDown(), "down");
        }
    }

    private static void go(Direction exit, String direction){
        int exitId = exit.getExit();
        if(!(exitId == 0)){
            // check if locked
            if(!exit.getLock().isLocked()){
                Engine.setFeedbackText("You can go " + direction);
                Engine.setCurrentScene(Engine.getScene(exitId));
            }else{
                Engine.setFeedbackText("Locked!!");
            }

        }else{
            Engine.setFeedbackText("You cannot go " + direction);
        }
    }


}
