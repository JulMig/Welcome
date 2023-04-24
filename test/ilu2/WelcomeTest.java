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
		assertEquals("Hello, Amy and Bob", Welcome.welcome("amy,bob"));
		assertEquals("Hello, Marie and Gilles", Welcome.welcome("marie,gilles"));
		
	}
	
	@Test
	void testPlusieursNoms() {
		assertEquals("Hello, Amy, Bob and Jerry", Welcome.welcome("Amy,bob,jerry"));
	}
	
	@Test
	void testCriPlusieursNoms() {
		assertEquals("Hello, Amy and Jerry. AND HELLO, BOB !", Welcome.welcome("Amy,BOB,jerry"));
	}
	
	@Test
	void testAnd() {
		assertEquals("Hello, Bob, Amy and Jerry", Welcome.welcome("bob,amy,jerry"));
		assertEquals("Hello, Bob and Jerry. AND HELLO, AMY AND JACK !", Welcome.welcome("bob,AMY,jerry,JACK"));
	}
	
	@Test
	void testSupressionEspace() {
		assertEquals("Hello, Bob and Amy", Welcome.welcome("bob     ,amy   "));
	}
	
}
