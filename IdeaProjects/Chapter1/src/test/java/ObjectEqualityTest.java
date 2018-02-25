import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class ObjectEqualityTest {

    ObjectEquality rectangle1 = null;
    ObjectEquality rectangle2 = null;




    @Before
    public void setUp() throws Exception {
        rectangle1 = new ObjectEquality(1,3);
        rectangle2 = new ObjectEquality(1,3);
    }



    @After
    public void tearDown() throws Exception
    {

    }
    @Test
    public void equality() throws Exception{
        assertTrue(rectangle2.equals(rectangle1));
    }

}