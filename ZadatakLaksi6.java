package razniZadaci;

import java.util.Scanner;

public class ZadatakLaksi6 {

	public static void main(String[] args) {
		// TODO Napisati program koji omogucava studentima da sracunaju prosek u zavisnosti od ocena polozenih ispita

		Scanner sc = new Scanner(System.in);
		int i = 1, ocena = 1;
		double zbir = 0, prosek = 0;
		
		while(ocena != 0) {
			System.out.println("Unesi ocenu");
			ocena = sc.nextInt();
			if(ocena > 5) {
				zbir += ocena;
				prosek = zbir / i;
				i++;
			} else {
				if(ocena == 0) {
					break;
				} else {
					System.out.println("Samo se polozeni ispiti racunaju, probaj opet");
				}
			}
		}

		System.out.println("Prosek je " + prosek);
	}

}
