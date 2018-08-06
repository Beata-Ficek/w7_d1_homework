import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;


    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Ice Cream", "Mike", 3, 1)

    }

    @Test
    public void getName() {
        assertEquals("TS", iceCreamStall.getName());}

    @Test
    public void getRating(){
        assertEquals(9, iceCreamStall.getRating());}
}

}
}
