package metier;

public class Suffixe {

	private static Suffixe instance = null;
	
	public static Suffixe getInstance() {
		if(instance == null) {
			instance = new Suffixe();
		}
		return instance;
	}
	
	private Suffixe() {
	}
	
	public String transform(String s, String suffixe) {
		return s+suffixe;
	}
}
