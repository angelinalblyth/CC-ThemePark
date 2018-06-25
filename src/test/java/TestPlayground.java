import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPlayground {

    Playground playground;
    Visitor visitor2;
    @Before
    public void setUp() throws Exception {
        playground = new Playground("Sand box", 1.45);
        visitor2 = new Visitor(10, 1.30, 50);
    }

    @Test
    public void canVisitorPlayInPlayground() {
        assertEquals(true, playground.isAllowedTo(visitor2));
    }
}
