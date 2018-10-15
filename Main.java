public class Main {
	
	public static void main(String... s) {
		displayNumber(5.037, 100005.0, 3.3);
	}
	
	public static void displayNumber(Number... numbers) {
		for (Number n : numbers) {
			System.out.println(String.format("%8.2f", n));
		}
	}
	
}