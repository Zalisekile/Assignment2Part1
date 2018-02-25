import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TruthTest {

    Truth addingNames = null;

    @Before
    public void setUp() throws Exception
    {
        addingNames = new Truth("patrick","chamanga");

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkFormat() throws Exception
    {
        assertTrue("The value is not a string value",addingNames.getName() instanceof String);
        assertTrue("The value is not a string value",addingNames.getSurname() instanceof String);

    }

    @Test
    public void concat() throws Exception
    {
        assertTrue("Its not James", "James Chamanga".equals(addingNames.concat()));


    }

}