import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddingTest {
    Adding addIt = null;

    @Before
    public void setUp() throws Exception {
        addIt = new Adding();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() throws Exception
    {
        assertEquals(8,addIt.add(2,6));
    }

}