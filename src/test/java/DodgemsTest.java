import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems ("Dodgemz", 6);
    }

    @Test
    public void hasName(){
        assertEquals("Dodgemz", dodgems.getName());
    }

    @Test
    public void setName(){
        dodgems.setName("Dodgemzz");
        assertEquals("Dodgemzz", dodgems.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(6, dodgems.getRating());
    }
}

