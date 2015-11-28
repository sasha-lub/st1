package ua.nure.lubchenko.SummaryTask1.airline;

import org.junit.Test;

import ua.nure.lubchenko.SummaryTask1.Demo;

public class DemoTest {
	@Test
	public void demoConstrTest() {
		@SuppressWarnings("unused")
		Demo inst = new Demo();
	}

	@Test
	public void mainTest() {
		Demo.main(new String[0]);
	}
}
