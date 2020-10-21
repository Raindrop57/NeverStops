
public class NeverStops {
	public static void main(String[] args) {
		int i = 0;
		while (i < 1000) {
			System.out.println("This code never stops");
			++i;
		}
		System.out.println("Or does it?");
	}
}
