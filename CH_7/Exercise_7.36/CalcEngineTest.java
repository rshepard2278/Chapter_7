

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CalcEngineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CalcEngineTest
{
    private CalcEngine calcEngi1;

    /**
     * Default constructor for test class CalcEngineTest
     */
    public CalcEngineTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        calcEngi1 = new CalcEngine();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testAdd()
    {
        calcEngi1.numberPressed(9);
        calcEngi1.plus();
        calcEngi1.numberPressed(9);
        assertEquals(9, calcEngi1.getDisplayValue());
        calcEngi1.equals();
        assertEquals(18, calcEngi1.getDisplayValue());
    }

    @Test
    public void testMinus()
    {
        calcEngi1.numberPressed(9);
        calcEngi1.minus();
        calcEngi1.numberPressed(8);
        assertEquals(8, calcEngi1.getDisplayValue());
        assertEquals(8, calcEngi1.getDisplayValue());
        calcEngi1.equals();
        assertEquals(1, calcEngi1.getDisplayValue());
    }

    @Test
    public void testClear()
    {
        calcEngi1.numberPressed(9);
        assertEquals(9, calcEngi1.getDisplayValue());
        calcEngi1.clear();
        assertEquals(0, calcEngi1.getDisplayValue());
    }
}



