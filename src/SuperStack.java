
public class SuperStack<T> {
	private T[] items;
	private int top;
	
	public SuperStack (int size) {
		if (size <= 0) {
			throw new IllegalArgumentException("Size must be positive");
		}
		items = (T[]) new Object[size];
		top = 0;
	}
	
	public boolean isEmpty() {
		if (top == 0) {
			return true;
		}
		
		return false;
	}
	
	public boolean isFull() 
	{
		if (top == items.length) {
			return true;
		}
		return false;
	}
	
	public boolean push(T item) {
		if (isFull()) {
			return false;
		}
		
		items[top++] = item;

		return true;
	}
	
	public T pop() {
		if (isEmpty()) {
			return null;
		}
		
		T result = items[--top];
		items[top] = null;
		return result;

	}
	
	public String toString() {
		return null;
	}

}
