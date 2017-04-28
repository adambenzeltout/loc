package ADAM;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest {

	@Test
	public void test() {

		JunitTest testt = new JunitTest();

		int output = testt.square(5);

		assertEquals(25, output);

	}

}
