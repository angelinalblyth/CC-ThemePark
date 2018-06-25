import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHotDo {

    Hotdog hotdog;

    @Before
    public void setUp() throws Exception {
        hotdog = new Hotdog ("Top Dog", "Bob", "A3");
    }

    @Test
    public void getStallName() {
        assertEquals("Top Dog", hotdog.getName());
    }

    @Test
    public void getStallOwnerName() {
        assertEquals("Bob", hotdog.getOwnerName());
    }

    @Test
    public void getStallParkingSpot(){
        assertEquals("A3", hotdog.getParkingSpot());
    }
}
