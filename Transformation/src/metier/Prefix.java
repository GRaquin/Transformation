package metier;

public class Prefix {
	private static Prefix instance = null;

	public static Prefix getInstance() {
		if (instance == null) {
			instance = new Prefix();
		}
		return instance;
	}
	/*
	 * Programme capable de faire ca
	 */

	private Prefix() {
		// TODO Auto-generated constructor stub
	}
	
	public String transform(String str){
		return "toto"+str;
	}

}
