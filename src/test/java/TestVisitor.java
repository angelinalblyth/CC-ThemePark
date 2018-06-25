import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestVisitor {

    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void setUp() throws Exception {
        visitor1 = new Visitor(20, 1.68, 50);
        visitor2 = new Visitor(10, 1.30, 50);
        visitor3 = new Visitor(15, 1.82, 50);
        visitor4 = new Visitor(28, 1.54, 50);
    }

    @Test
    public void visitorHasAge() {
        assertEquals((Integer)20, visitor1.getAge());
    }

    @Test
    public void visitorHasHeight() {
        assertEquals((Double)1.68, visitor1.getHeight());
    }

    @Test
    public void visitorHasMoney() {
        assertEquals((Integer)50, visitor1.getMoney());
    }
}
