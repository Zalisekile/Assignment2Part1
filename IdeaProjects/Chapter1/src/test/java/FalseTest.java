import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FalseTest {
    False minus = null;
    @Before
    public void setUp() throws Exception
    {
        minus = new False();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void subtract() throws Exception
    {
        assertFalse("The is not 0",minus.subtract(4,2) == 0);
    }

}