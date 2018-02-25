import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyingTest {
    Multiplying multi = null;
    @Before
    public void setUp() throws Exception
    {
        multi = new Multiplying();
    }

    @After
    public void tearDown() throws Exception
    {
        multi = null;
    }

    @Test
    public void multiply() throws Exception
    {
        assertEquals(42,multi.multiply(6,7));
    }

}