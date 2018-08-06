
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("The big dipper", 10);
    }

    @Test
    public void hasName(){
        assertEquals("The big dipper", rollercoaster.getName());
    }

    @Test
    public void setName(){
        rollercoaster.setName("The bigger dipper");
        assertEquals("The bigger dipper", rollercoaster.getName());
    }

    @Test
    public void getRating(){
        Assert.assertEquals(10, rollercoaster.getRating());}


}
