import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class SampleClassTest {

	@Test
	public void testSample() {
		SampleClass sample = new SampleClass();
		assertEquals("Sample", sample.getSample());
	}
	
	@Test
	public void testSampleMock()
	{
		String mockSampleString = "MockSample";
		SampleClass mockSample = mock(SampleClass.class);
		when(mockSample.getSample()).thenReturn(mockSampleString);
		assertEquals(mockSampleString, mockSample.getSample());
	}

}
