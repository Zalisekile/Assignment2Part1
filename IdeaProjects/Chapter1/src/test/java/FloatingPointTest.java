import static org.junit.Assert.*;

public class FloatingPointTest {

    static FloatingPoint calc = null;

    @org.junit.Before
    public void setUp() throws Exception
    {

        calc = new FloatingPoint();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        calc = null;
    }

    @org.junit.Test
    public void multiply() throws Exception
    {

        assertTrue(calc.multiply(2f, 1f)== 4f);
    }

}