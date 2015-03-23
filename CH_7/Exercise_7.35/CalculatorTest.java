

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CalculatorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CalculatorTest
{
    private CalcEngine calcEngi1;
    private UserInterface userInte1;

    

    /**
     * Default constructor for test class CalculatorTest
     */
    public CalculatorTest()
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
        userInte1 = new UserInterface(calcEngi1);
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
}
