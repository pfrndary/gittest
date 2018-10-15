public class Main {
	
	public static void main(String... s) {
		displayNumber(5.037, 8, 10589);
	}
	
	public static void displayNumber(Number... numbers) {
		for (Number number : numbers) {	
			System.out.println(number.toString());
		}
	}
	
}