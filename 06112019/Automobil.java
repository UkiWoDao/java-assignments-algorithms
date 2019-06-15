package domaci06112019;

import java.text.DecimalFormat;

public class Automobil extends Vozilo{

	DecimalFormat f = new DecimalFormat("##.00");
	
	public Automobil(int serBroj, int velRez, int potrosnja) {
		super(serBroj, velRez, potrosnja);
	}
	
	public double ide(double km) {
		if(this.trenGor == 0) {
			System.out.println("Ovo ne ide nigde sefe");
		}
		// koliko trosi na kilometar
		double autoPotrosnja = (this.getPotrosnja() / 100) * 1.1;
		if(this.trenGor >= autoPotrosnja * km) {
			this.trenGor -= autoPotrosnja * km;
			return km;
		} else {
			double a = this.trenGor / autoPotrosnja;
			this.trenGor = 0;
			return a;
		}

	}
	
	@Override
	public String toString() {
		return this.getSerBroj() + "{" + this.getRegBroj() + "}" + 
			   f.format(this.trenGor) + "/" + this.getVelRez() + " - " + 
			   this.getPotrosnja() * 1.1 + "L/100km";
	}
}
