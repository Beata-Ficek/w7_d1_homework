import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;


    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("TS", "Lizzie", 5, 9);
        visitor = new Visitor ("George", 17, 178);
    }

    @Test
    public void CheckIfIsAllowedTo(Visitor visitor){
        visitor.getAge();
        assertEquals(false, tobaccoStall.isAllowedTo(Visitor visitor));
    }

    @Test
    public void getRating(){
        assertEquals(9, tobaccoStall.getRating());}
}
