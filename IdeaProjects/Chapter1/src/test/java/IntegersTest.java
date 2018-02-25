import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegersTest {
    Integers calc = null;
    @Before
    public void setUp() throws Exception {
        calc = new Integers();
    }

    @After
    public void tearDown() throws Exception {
        calc = null;
    }

    @Test
    public void add() throws Exception
    {
        assertEquals(8,calc.add(5,3));
    }

}