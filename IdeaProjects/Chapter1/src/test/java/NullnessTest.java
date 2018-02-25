import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NullnessTest {

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
        assertNull("It isn't null dawg",person2);
    }

}