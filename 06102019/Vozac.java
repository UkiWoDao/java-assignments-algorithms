package domaci06102019;

public class Vozac extends Covek{
	
	private String titula = "Sofer";
	
	public Vozac() {
		this("genericnoIme", 80);
	}
	
	public Vozac(String ime, int tezina) {
		super(ime, tezina);
	}
	
	public String getTitula() {
		return this.titula;
	}
	
	public String ispis() {
		String s = this.getTitula();
		return s + super.ispis();
	}
	
}
