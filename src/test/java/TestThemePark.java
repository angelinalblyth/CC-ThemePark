import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestThemePark {

    ThemePark themePark;


    @Before
    public void setUp() throws Exception {
        themePark = new ThemePark("Shockpark");
    }

    @Test
    public void getThemeParkName() {
        assertEquals("Shockpark", themePark.getName());
    }


}
