package core;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    public static int d6(){
        return ThreadLocalRandom.current().nextInt(1, 7);
    }

}
