import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class DisablingTestTest
{
    DisablingTest checkingNames =  null;

    @Before
    public void setUp() throws Exception
    {
      checkingNames =  new DisablingTest();
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Ignore
    @Test
    public void compareNames() throws Exception
    {
        assertTrue(checkingNames.compareNames("Zali","Paul"));
    }

}