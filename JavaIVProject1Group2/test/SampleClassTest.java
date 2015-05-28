import static org.junit.Assert.*;

import org.junit.Test;

public class SampleClassTest {

	@Test
	public void test() {
		SampleClassTest sampleClass = new SampleClassTest();
		assertTrue( sampleClass.isSample() );
	}

	private boolean isSample() {
		// TODO Auto-generated method stub
		return false;
	}
}
