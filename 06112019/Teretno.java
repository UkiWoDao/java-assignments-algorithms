package domaci06112019;

import java.text.DecimalFormat;

public class Teretno extends Vozilo{
	
	DecimalFormat f = new DecimalFormat("##.00");
	
	public Teretno(int serBroj, int velRez, int potrosnja) {
		super(serBroj, velRez, potrosnja);
	}
	
	public double ide(double km) {
		if(this.trenGor == 0) {
			System.out.println("Ovo ne ide nigde sefe");
		}

		double teretPotrosnja = (this.getPotrosnja() / 100) * 1.1 * 3;
		if(this.trenGor >= teretPotrosnja * km) {
			this.trenGor -= teretPotrosnja * km;
			return km;
		} else {
			double a = this.trenGor / teretPotrosnja;
			this.trenGor = 0;
			return a;
		}

	}
	
	@Override
	public String toString() {
		return this.getSerBroj() + "{" + this.getRegBroj() + "}" + 
			   f.format(this.trenGor) + "/" + this.getVelRez() + " - " + 
			   this.getPotrosnja() * 1.1 * 3 + "L/100km";
	}
}
