package razniZadaci;

import java.util.Scanner;

public class ZadatakLaksi3 {

	public static void main(String[] args) {
		// TODO Napisati program koji pronalazi najmanji/najveci broj u nizu unetih brojeva

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi n");
		int n = sc.nextInt(), najV = 0, najM = 0;
		
		while(n != 0) {
			if(n >= najV) {
				najV = n;
			}
			if(n <= najM) {
				najM = n;
			}
			System.out.println("Unesi jos jedan broj");
			n = sc.nextInt();
		}
		System.out.println("Najveci od unetih brojeva je " + najV + ", a najmanji " + najM);

	}

}
