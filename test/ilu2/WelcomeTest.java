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
	
	@Test
	void test_welcome_rien() {
		assertEquals("Hello, my friend", Welcome.welcome(null));
		assertEquals("Hello, my friend", Welcome.welcome(""));
		assertEquals("Hello, my friend", Welcome.welcome("   "));
		
	}
	
}
