import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;


    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall ("TS", "Lizzie", 5, 9);

    }

    @Test
    public void getName() {
    assertEquals("TS", candyFlossStall.getName());}

    @Test
    public void getRating(){
        assertEquals(9, candyFlossStall.getRating());}
}

}
