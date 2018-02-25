import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObjectIdentityTest {
    ObjectIdentity person1 = null;
    ObjectIdentity person2 = null;
    @Before
    public void setUp() throws Exception
    {
        person1 = new ObjectIdentity("Micheal","Knight");
        person2 = person1;
    }

    @After
    public void tearDown() throws Exception
    {
        ObjectIdentity person1 = null;
        ObjectIdentity person2 = null;
    }

    @Test
    public void identity() throws Exception
    {
        assertSame(person1,person2);
    }

}