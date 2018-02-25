import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractingTest {
    Subtracting sub = null;

    @Before
    public void setUp() throws Exception
    {
        sub = new Subtracting();
    }

    @After
    public void tearDown() throws Exception
    {
        sub = null;
    }

    @Test
    public void add() throws Exception
    {
        assertEquals(9,sub.subtract(7, 6));
    }

}