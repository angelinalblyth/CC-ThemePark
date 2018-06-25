import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBeerGarden {

    BeerGarden beergarden;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        beergarden = new BeerGarden("Rufus", "T Firefly", "C7");

        visitor1 = new Visitor(20, 1.68, 50);
        visitor2 = new Visitor(10, 1.30, 50);
    }

    @Test
    public void canVisitorVisitBeerGarden() {
        assertEquals(true, beergarden.isAllowedTo(visitor1));
        assertEquals(false, beergarden.isAllowedTo(visitor2));
    }
}
