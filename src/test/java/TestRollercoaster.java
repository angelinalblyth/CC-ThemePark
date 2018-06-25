import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRollercoaster {

    Rollercoaster rollercoaster1;
    Rollercoaster rollercoaster2;
    Rollercoaster rollercoaster3;
    Rollercoaster rollercoaster4;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void setUp() throws Exception {
        rollercoaster1 = new Rollercoaster("Nemesis", 1.50);
        rollercoaster2 = new Rollercoaster("Blade", 1.80);
        rollercoaster3 = new Rollercoaster("Smiler", 1.30);
        rollercoaster4 = new Rollercoaster("Rita", 1.50);

        visitor1 = new Visitor(20, 1.68, 50);
        visitor2 = new Visitor(10, 1.30, 50);
        visitor3 = new Visitor(15, 1.82, 50);
        visitor4 = new Visitor(28, 1.54, 50);
    }

    @Test
    public void getName() {
        assertEquals("Nemesis", rollercoaster1.getName());
    }

    @Test
    public void getMinHeight() {
        assertEquals((Double)1.50, rollercoaster1.getHeightRestriciton());
    }

    @Test
    public void canVisitorRideAttraction(){
        assertEquals(true, rollercoaster1.isAllowedTo(visitor1));
        assertEquals(false, rollercoaster2.isAllowedTo(visitor4));
    }
}
