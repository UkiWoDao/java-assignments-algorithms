package domaci06112019;



public abstract class Vozilo {

	private int regBroj;
	private int serBroj;
	private double velRez;
	protected double trenGor = 0;
	private double potrosnja;
	private double km = 0;
	
	public Vozilo(int serBroj, int velRez, double potrosnja) {
		this.serBroj = serBroj;
		this.velRez = velRez;
		this.potrosnja = potrosnja;
	}
	
	abstract double ide(double km);
		
	public int getRegBroj() {
		return this.regBroj;
	}

	public void setRegBroj(int regBroj) {
		this.regBroj = regBroj;
	}

	public int getSerBroj() {
		return this.serBroj;
	}

	public double getVelRez() {
		return this.velRez;
	}

	public double getPotrosnja() {
		return this.potrosnja;
	}
	
	public void dodajCorbu(int c) {
		// ako neko pokusa da dodaje gorivo negativnim brojevima
		if (c <= 0) {
			System.out.println("Mozda je oduzmiCorbu() metoda za tebe?");
		} else {
			// provera da li rezervoar moze toliko da primi
			if(this.trenGor + c <= this.getVelRez()) {
				this.trenGor += c;
			} else {
				System.out.println("Ne moze toliko da stane druze");
			}
		}
	}
	
	public void oduzmiCorbu(int c) {
		// provera da li je rezervoar prazan
		if(this.trenGor != 0) {
			// ako nije oduzeti apsolutnu vrednost unetog parametra
			int g = Math.abs(c);
			this.trenGor -= c;
		} else {
			System.out.println("Rezervoar je vec prazan prijatelju");
		}
	}
	
	public String toString() {
		return this.getSerBroj() + "{" + this.getRegBroj() + "}" + 
			   this.trenGor + "/" + this.getVelRez() + " - " + 
			   this.getPotrosnja() + "L/100km";
	}
}
