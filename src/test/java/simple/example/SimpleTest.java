package simple.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SimpleTest {

	@Test
	public void testConcatenate() {
		MyUnitTest myUnit = new MyUnitTest();

		String result = myUnit.concatenate("one", "two");

		assertEquals("onetow", result);

	}

}
