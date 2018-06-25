import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestIceCream {

    IceCream icecream;

    @Before
    public void setUp() throws Exception {
        icecream = new IceCream("Dairy Ice Cream", "Jjill", "B5");
    }

    @Test
    public void getStallName() {
        assertEquals("Dairy Ice Cream", icecream.getName());
    }

    @Test
    public void getStallOwnerName() {
        assertEquals("Jill", icecream.getOwnerName());
    }

    @Test
    public void getStallParkingSport(){
        assertEquals("B5", icecream.getParkingSpot());
    }
}
