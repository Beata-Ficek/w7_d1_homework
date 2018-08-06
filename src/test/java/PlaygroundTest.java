import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor;

    @Before
    public void before(){
        playground = new Playground("Smugglers Cove", 8);
        visitor = new Visitor ("Elsa", 17, 160);
    }

    @Test
    public void hasName(){
        assertEquals("Smugglers Cove", playground.getName());
    }

    @Test
    public void setName(){
        playground.setName("Wynford Farm");
        assertEquals("Wynford Farm", playground.getName());
    }

    @Test
    public void CheckIfIsAllowedTo(Visitor visitor){
        assertEquals(false, playground.isAllowedTo(Visitor visitor));
    }

    @Test
    public void getRating(){
        assertEquals(8, playground.getRating());}
}
