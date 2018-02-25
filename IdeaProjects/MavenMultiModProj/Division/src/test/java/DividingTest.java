import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DividingTest {
    Dividing div = null;

    @Before
    public void setUp() throws Exception
    {
        div = new Dividing();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void divide() throws Exception
    {
      assertEquals( 2,div.divide(9,4));
    }

}