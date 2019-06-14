package domaci06102019;

public class Zadatak1 {

	public static void main(String[] args) {
		
//		Covek c1 = new Vozac("Mile", 100);
//		Vozac v2 = new Vozac("Djole", 70);
//		Covek c3 = new Covek("Rade", 80);
//		Covek c4 = new Putnik("Sofokle", 300.00);
		Putnik mare = new Putnik("Marko", 200);
		Putnik deksa = new Putnik("Dejan", 50);
		Putnik djole = new Putnik("Djordje", 300);
		Putnik uki = new Putnik("Uros", 150);
		Putnik vlaja = new Putnik("Vladimir", 200);
		
		// provera ispisa
//		System.out.println(c1.ispis());
//		System.out.println(v2.ispis());
//		System.out.println(c3.ispis());
//		System.out.println(c4.ispis());

		Autobus a = new Autobus("Djurdjicatravel", 100.00, 10);
		a.dodatiVozaca();
		a.imaVozac();
		a.dodatiPutnika(mare, 2);
		a.dodatiPutnika(deksa, 3);
		System.out.println(a.toString());
		a.naplatitiNesrecnicima();
		System.out.println(a.toString());
		
		Vozac v = new Vozac("Mile", 100);
		a.sklonitiVozaca();
		a.naplatitiNesrecnicima();
		
		a.dodatiVozaca(v);
		System.out.println(a.toString());
	}

}
