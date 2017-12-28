package simple.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimpleTest {

	@Test
	public void testConcatenate() {
		MyUnitTest myUnit = new MyUnitTest();

		String result = myUnit.concatenate("one", "two");

		assertEquals("onetwo", result);

	}

}
