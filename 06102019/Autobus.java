package domaci06102019;

public class Autobus {
	
	private String naziv;
	private Vozac vozac;
	private double cenaKarte;
	private Putnik putnici[];
	
	public Autobus(String naziv, double cena, int i) {
		this.naziv = naziv;
		this.cenaKarte = cena;
		putnici = new Putnik[i];
	}
	
	public void dodatiVozaca() {
		// vozacevo mesto je naravno prvo, ili kako bi dusan rekao nulto
		if(vozac == null) {
			vozac = new Vozac();
			System.out.println("Novi vozac je postavljen");
		} else {
			System.out.println("Vec postoji vozac");
		}
	}
	
	public void dodatiVozaca(Vozac v) {
		if(vozac == null) {
			vozac = v;
			System.out.println("Novi vozac je postavljen");
		} else {
			System.out.println("Vec postoji vozac");
		}
	}
	
	public void sklonitiVozaca() {
		if(vozac == null) {
			System.out.println("Vozaca ionako nema");
		} else {
			vozac = null;
			System.out.println("Vozac sklonjen");
		}
	}
	
	public boolean imaVozac() {
		if(vozac != null) {
			return true;
		} else return false;
	}
	
	public void dodatiPutnika(Putnik p, int i) {
		// provera da li parametar odgovara realnom mestu
		if(i < 0 || i > putnici.length) {
			System.out.println("Unesite sediste od 0 do " + putnici.length);
			return;
		} 
		
		// provera da li je mesto zauzeto
		for(int k = 1; k < putnici.length; k++) {
			if(putnici[k] == null) {
				putnici[k] = p;
				return;
			}
		}
	}
	
	public void naplatitiNesrecnicima() {
		if(this.imaVozac() == true) {
			for(int i = 0; i < putnici.length; i++) {
				if(putnici[i] != null) {
					if(putnici[i].getNovac() < this.cenaKarte) {
						putnici[i] = null;
					} else {
						putnici[i].oduzmiNovac(this.cenaKarte);
					}
				}
			}
		} else {
			System.out.println("Nemoguce naplatiti kad nema vozaca");
		}
	}
	
	public String toString() {
		String s = "[" + this.naziv + "]{" + this.cenaKarte + "}";
		if(this.imaVozac()) {
			s += vozac.getIme() + "\n";
		}
		for(int i = 0; i < putnici.length; i++) {
			if(putnici[i] != null) {
				s += putnici[i].ispis() + "\n";
			}
		}
		return s;
	}
}
