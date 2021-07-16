package core;

import data.scenes.Scene;

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
        int newExitId;
        switch (direction) {
            case "north" -> {
                newExitId = currentScene.getNorth().getExit();
                go(newExitId, "north");
            }
            case "south" -> {
                newExitId = currentScene.getSouth().getExit();
                go(newExitId, "south");;
            }
            case "east" -> {
                newExitId = currentScene.getEast().getExit();
                go(newExitId, "east");
            }
            case "west" -> {
                newExitId = currentScene.getWest().getExit();
                go(newExitId, "west");
            }
            case "up" -> {
                newExitId = currentScene.getUp().getExit();
                go(newExitId, "up");
            }
            case "down" -> {
                newExitId = currentScene.getDown().getExit();
                go(newExitId, "down");
            }
        }
    }

    private static void go(int exitId, String direction){
        if(!(exitId == 0)){
            Engine.setFeedbackText("You can go " + direction);
            Engine.setCurrentScene(Engine.getScene(exitId));
        }else{
            Engine.setFeedbackText("You cannot go " + direction);
        }
    }


}
