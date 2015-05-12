import static org.junit.Assert.*;

import org.junit.Test;


public class SimpleMathTest {

	@Test
    public void testAdd() {
        assertEquals(5, SimpleMath.add(2,  3));
    }

    @Test
    public void testSubtract() {
        assertEquals( 4, SimpleMath.subtract(42, 38));
    }
}
