import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SuperStackTest {

	void setUp() throws Exception {
		
	}

	@Test
	void testSuperStack() {
		fail("Not yet implemented");
	}

	@Test
	void testIsEmpty() {
		//Create an empty stack and test if it is empty
		//Add elements and check if it is empty
		SuperStack<Integer> stack = new SuperStack<Integer>(1);
		boolean result = stack.isEmpty();
		assertTrue(result);
		
		stack.push(3);
		result = stack.isEmpty();
		assertFalse(result);
	}

	@Test
	void testIsFull() {
		fail("Not yet implemented");
	}

	@Test
	void testPush() {
		fail("Not yet implemented");
	}

	@Test
	void testPop() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
