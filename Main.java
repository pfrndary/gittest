public class Main {
	
	public static void main(String... s) {
		displayNumber(5.037, 100005.0, 3.3, 89.0, 99999999.9);
	}
	
	public static void displayNumber(Number... numbers) {
		for (Number n : numbers) {
			System.out.println(String.format("Valeur : \t\t\t%8.2f", n));
		}
	}
	
}
