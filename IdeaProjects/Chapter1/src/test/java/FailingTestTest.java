import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FailingTestTest {
    FailingTest divide = null;

    @Before
    public void setUp() throws Exception
    {
        divide = new FailingTest();
    }

    @After
    public void tearDown() throws Exception
    {
        divide = null;
    }

    @Test
    public void division() throws Exception
    {
        try
        {
            //String num = "h";
            int num = 5;
            divide.division(num,2);
            fail("This Test is failing dawg");
        }
        catch(NumberFormatException e)
        {
            System.out.print("Incorrect number format");
        }
    }

}