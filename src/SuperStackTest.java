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
		SuperStack<Integer> stack = new SuperStack<Integer>(1);
		boolean result = stack.isFull();
		assertFalse(result);
		
		stack.push(3);
		result = stack.isFull();
		assertTrue(result);
	}

	@Test
	void testPush() {
		SuperStack<Integer> stack = new SuperStack<Integer>(1);
		boolean result = stack.push(3);
		assertTrue(result);
		
		result = stack.push(3456);

		assertFalse(result);
	}

	@Test
	void testPop() {
		SuperStack<Integer> stack = new SuperStack<Integer>(1);
		stack.push(3);
		int result = stack.pop();
		assertEquals(result, 3);

	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
