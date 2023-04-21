package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void premier_test() {
		assertEquals("Hello, Bob", Welcome.welcome("bob"));
		assertEquals("Hello, Gilles", Welcome.welcome("gilles"));
		assertEquals("Hello, Marie", Welcome.welcome("marie"));
	}
	
}
