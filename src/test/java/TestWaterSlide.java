import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWaterSlide {

    Waterslide waterslide;

    @Before
    public void setUp() throws Exception {
        waterslide = new Waterslide("Tornado", 1.0);
    }

    @Test
    public void getSlideName() {
        assertEquals("Tornado", waterslide.getName());
    }

}
