import junit.framework.*;
import junit.framework.TestCase;
/** A JUnit test class to test the class IMath. */
public class IMathTest extends TestCase {
    /** Tests isqrt. */
    public void testIsqrt() {
        assertEquals(0, IMath.isqrt(0));
        assertEquals(1, IMath.isqrt(1));
        assertEquals(1, IMath.isqrt(2));
        assertEquals(1, IMath.isqrt(3));
        assertEquals(2, IMath.isqrt(4));
        assertEquals(2, IMath.isqrt(7));
        assertEquals(3, IMath.isqrt(9));
        assertEquals(10, IMath.isqrt(100));
    }

    /** Returns the test suite for this test class. */
    public static Test suite() {
        return new TestSuite(IMathTest.class);
    }

    /** Run the tests. */
    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }
}