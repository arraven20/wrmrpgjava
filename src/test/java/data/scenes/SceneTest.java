package data.scenes;

import data.scenes.Scene;
import data.scenes.directions.North;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

public class SceneTest {
    private static Scene SCENE = new Scene(0, "scene title", "scene description");

//    @BeforeEach
//    public void setUp() throws Exception {
//        SCENE = new Scene(0, "scene title", "scene description");
//        SCENE.setNorth(new North("north desc", 1));
//    }

    @Test
    public void testId(){ assertEquals(0, SCENE.getSceneId()); }

    @Test
    public void testTitle(){ assertEquals("scene title", SCENE.getTitle()); }

    @Test
    public void testDescription(){ assertEquals("scene description", SCENE.getDescription()); }



}
