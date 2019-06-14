package domaci06102019;

public class Covek {
	
	public static int globalId = 1;
	private String ime;
	private int tezina;
	private int ID;
	
	public Covek(int i) {
		this("Srba", 80);
	}
	
	public Covek(String ime) {
		this(80);
		this.ime = ime;
	}
	
	public Covek(String ime, int tezina) {
		this.ime = ime;
		this.tezina = tezina;
		this.ID = globalId++;
	}

	public String getIme() {
		return this.ime;
	}

	public int getTezina() {
		return this.tezina;
	}
	
	public int getID() {
		return this.ID;
	}
	
	public String ispis() {
		String s = "[" + this.getID() + "]" + this.getIme() + ":{" + this.getTezina() + "}";
		return s;  
	}
}
