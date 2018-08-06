import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class VisitorTest {

    Visitor visitor1;

    @Before
    public void before(){
        visitor1 = new Visitor ("Lizzie", 16, 172);
    }

    @Test
    public void hasName(){
        assertEquals("Lizzie", visitor1.getName());
    }

    @Test
    public void SetName(){
        visitor1.setName("John");
        assertEquals("John", visitor1.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(16, visitor1.getAge());
    }

    @Test
    public void setAge(){
        visitor1.setAge(12);
        assertEquals(12, visitor1.getAge());
    }

    @Test
    public void hashHeight(){
        assertEquals(172, visitor1.getHeight());
    }

    @Test
    public void setHeight(){
        visitor1.setHeight(160);
        assertEquals(160, visitor1.getHeight());
    }



}
