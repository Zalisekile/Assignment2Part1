import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayContentsTest {

    String[] array1 = null;
    String[] array2= null;

    @Before
    public void setUp() throws Exception
    {
        array1 = new String[] {"apple","mango","grapes"};
        array2 = new String[] {"apple","mango","grapes"};

    }

    @After
    public void tearDown() throws Exception
    {
        String[] array1 = null;
        String[] array2= null;
    }

    @Test
    public void testArrays() throws Exception
    {
        assertArrayEquals(array1,array2);
    }



}