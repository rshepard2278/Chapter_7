import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SalesItemTest.
 *
 * @author  mik
 * @version 0.1
 */
public class SalesItemTest
{
    private SalesItem salesIte1;
    private SalesItem salesIte2;

    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest()
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
        salesIte1 = new SalesItem("Thing 1", 9999);
        salesIte1.addComment("Rick", "Works Great", 5);
        salesIte1.addComment("James", "Sucks", 1);
        salesIte2 = new SalesItem("Thing 2", 999);
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

    /**
     * Test that a comment can be added, and that the comment count is correct afterwards.
     */
    @Test
    public void testAddComment()
    {
        SalesItem salesIte1 = new SalesItem("Java for complete Idiots", 21998);
        assertEquals(true, salesIte1.addComment("James Duckling", "This book is great. I learned all my Java from it.", 4));
        assertEquals(1, salesIte1.getNumberOfComments());
    }

    /**
     * Test that a comment using an illegal rating value is rejected.
     */
    @Test
    public void testIllegalRating()
    {
        SalesItem salesIte1 = new SalesItem("Java For Complete Idiots, Vol 2", 19900);
        assertEquals(false, salesIte1.addComment("Joshua Black", "Not worth the money. The font is too small.", -5));
    }

    /**
     * Test that a sales item is correctly initialised (name and price).
     */
    @Test
    public void testInit()
    {
        SalesItem salesIte1 = new SalesItem("test name", 1000);
        assertEquals("test name", salesIte1.getName());
        assertEquals(1000, salesIte1.getPrice());
    }

    @Test
    public void testTwoComments()
    {
        SalesItem salesIte1 = new SalesItem("RThing", 1000);
        assertEquals(true, salesIte1.addComment("Rick", "test", 2));
        assertEquals(true, salesIte1.addComment("jimmy", "works great", 5));
        assertEquals(2, salesIte1.getNumberOfComments());
    }

    @Test
    public void testAddDuplicateAuthors()
    {
        SalesItem salesIte1 = new SalesItem("Thing", 1000);
        assertEquals(true, salesIte1.addComment("Rick", "works great", 5));
        assertEquals(false, salesIte1.addComment("Rick", "Nevermind it sucks", 1));
    }

    @Test
    public void testOutOfBoundsRating()
    {
        SalesItem salesIte1 = new SalesItem("test thing 1", 1000);
        assertEquals(false, salesIte1.addComment("Rick", "this thing really sucks", 0));
        assertEquals(false, salesIte1.addComment("Jimmy", "This this is SOOOO AWESOME!!!!", 6));
    }

    @Test
    public void testFindMostHelpfulCommetn()
    {
        SalesItem salesIte1 = new SalesItem("TEST", 1000);
        assertEquals(false, salesIte1.addComment("Rick", "AWESOME", 6));
        assertEquals(true, salesIte1.addComment("TEST", "AWESOME", 5));
        assertEquals(true, salesIte1.addComment("Jimmy", "SUCKS", 2));
        salesIte1.upvoteComment(0);
        salesIte1.upvoteComment(0);
        salesIte1.downvoteComment(1);
        Comment comment1 = salesIte1.findMostHelpfulComment();
        assertEquals(comment1, comment1);
        java.lang.String string1 = comment1.getFullDetails();
        assertEquals(string1, string1);
        assertEquals("TEST", comment1.getAuthor());
    }
}






