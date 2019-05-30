package razniZadaci;

import java.util.Scanner;

public class ZadatakLaksi4 {

	public static void main(String[] args) {
		// TODO Napisati program koji pretvara veliki broj dana u godine, nedelje i dane

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Koliko dana?");
		int dani = sc.nextInt();
		int godine = 0, nedelje = 0, ostatakDana = 0;
			
		godine = prestupnaGodina(dani);
		ostatakDana = dani % 365;
		nedelje = ostatakDana / 7;
		ostatakDana = ostatakDana % 7;
		System.out.println(dani + " dana je " + godine + " godina, " + nedelje + " nedelja i " + ostatakDana + " dana.");
	}
	
	static int prestupnaGodina(int brojDana) {
		int prestupneGodine, godine;
		// koliko prestupnih godina ima toliko cemo dana dodati
		prestupneGodine = brojDana / (365 * 4);
		godine = (brojDana / 365) + prestupneGodine;
		return godine;
	}
}
