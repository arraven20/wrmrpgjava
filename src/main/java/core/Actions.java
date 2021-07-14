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
                goNorth(newExitId);
            }
            case "south" -> {
                newExitId = currentScene.getSouth().getExit();
                goSouth(newExitId);
            }
        }
    }

    private static void goNorth(int exitId){
        if(!(exitId == 0)){
            Engine.setFeedbackText("You can go north");
            Engine.setCurrentScene(Engine.getScene(exitId));
        }else{
            Engine.setFeedbackText("You cannot go north");
        }
    }

    private static void goSouth(int exitId){

        if(!(exitId == 0)){
            Engine.setFeedbackText("You can go south");
            Scene newScene = Engine.getScene(exitId);
            Engine.setCurrentScene(newScene);
        }else{
            Engine.setFeedbackText("You cannot go south");
        }
    }
}
