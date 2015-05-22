import static org.junit.Assert.*;

import org.junit.Test;

public class SampleClassTest {

	@Test
	public void test() {
		SampleClass sampleClass = new SampleClass();
		assertTrue( sampleClass.isSample() );
	}
}
