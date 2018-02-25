import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NonNullnessTest {

    Nullness person1 = null;
    Nullness person2 = null;

    @Before
    public void setUp() throws Exception
    {
        person1 = new Nullness("William ","Shongwe");
    }

    @After
    public void tearDown() throws Exception
    {
        Nullness person1 = null;
        Nullness person2 = null;
    }

    @Test
    public void testNull() throws Exception
    {
        assertNotNull("It cant be t null dawg",person1);
    }

}