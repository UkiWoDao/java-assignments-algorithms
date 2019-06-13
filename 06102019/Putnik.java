package domaci06102019;

public class Putnik extends Covek{
	
	private double novac;

	public Putnik(String ime, double novac) {
		super(ime);
		this.novac = novac;
	}

	public void setNovac(double novac) {
		this.novac = novac;
	}
	
	public double getNovac() {
		return this.novac;
	}
	
	public boolean dodajNovac(double novac) {
		double a = Math.abs(novac);
		this.novac += a;
		return true;
	}
	
	public boolean oduzmiNovac(double novac) {
		double a = Math.abs(novac);
		if(this.novac >= a) {
			this.novac -= a;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String ispis() {
		String s = "Putnik[" + this.novac + "]";
		return s + super.ispis();
	}
	
}
