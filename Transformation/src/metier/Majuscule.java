package metier;

public class Majuscule {
	
	Majuscule() {
	}
	
	private static Majuscule instance = null;
	
	public static Majuscule getInstance() {
		if (instance == null) {
			instance = new Majuscule();
		}
		return instance;
	}
	
	public String transform(String message) {
		return message.toUpperCase();
	}
}
