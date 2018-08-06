import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("Victoria Park", 3);
    }

    @Test
    public void hasName(){
        assertEquals("Victoria Park", park.getName());
    }

    @Test
    public void setName(){
        park.setName("Duthie Park");
        assertEquals("Duthie Park", park.getName());
    }

    @Test
    public int getRating(){
        assertEquals(3, park.getRating());
    }

}
