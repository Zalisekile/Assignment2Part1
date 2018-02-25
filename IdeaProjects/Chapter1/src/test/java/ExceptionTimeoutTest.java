import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionTimeoutTest {

    ExceptionTimeout person1 = null;

    @Before
    public void setUp() throws Exception
    {
        person1 = new ExceptionTimeout();
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test(timeout = 100)
    public void setName() throws Exception
    {
        String Name;
        person1.setName();
    }

}