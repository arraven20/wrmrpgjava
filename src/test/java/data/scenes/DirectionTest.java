package data.scenes;

import data.Lock;
import data.scenes.directions.North;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

public class DirectionTest {
    private North north;

    @BeforeEach
    public void setUp() throws Exception {
        north = new North("north desc", 1, new Lock());
    }

//    @Test
//    public void testNorthDesc(){ assertEquals("north desc", north.getSceneId()); }

}
