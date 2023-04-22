package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void premierTest() {
		assertEquals("Hello, Bob", Welcome.welcome("bob"));
		assertEquals("Hello, Gilles", Welcome.welcome("gilles"));
		assertEquals("Hello, Marie", Welcome.welcome("marie"));
	}
	
	@Test
	void testWelcomeRien() {
		assertEquals("Hello, my friend", Welcome.welcome(null));
		assertEquals("Hello, my friend", Welcome.welcome(""));
		assertEquals("Hello, my friend", Welcome.welcome("   "));
		
	}
	
	@Test
	void testMajuscule() {
		assertEquals("HELLO, JERRY !", Welcome.welcome("JERRY"));
		assertEquals("HELLO, BOB !", Welcome.welcome("BOB"));
		assertEquals("HELLO, MARIE !", Welcome.welcome("MARIE"));
	}
	
	@Test
	void testDeuxNoms() {
		assertEquals("Hello, Amy, Bob", Welcome.welcome("amy,bob"));
		assertEquals("Hello, Marie, Gilles", Welcome.welcome("marie,gilles"));
		
	}
	
	@Test
	void testPlusieursNoms() {
		assertEquals("Hello, Amy, Bob, Jerry", Welcome.welcome("Amy,bob,jerry"));
	}
	
}
