package razniZadaci;

import java.util.Scanner;

public class ZadatakLaksi2 {

	public static void main(String[] args) {
		/* TODO Napisati program koji pronalazi broj parnih, neparnih, 
		dvocifrenih, deljivih sa 3 u nizu brojeva */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Do kog broja je niz?");
		int n = sc.nextInt(), parni = 0, neparni = 0, dvocifreni = 0, deljivi3 = 0;
		
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 0) {
				parni++;
			}
			if(i % 2 != 0) {
				neparni++;
			}
			if(i > 9) {
				dvocifreni++;
			}
			if(i % 3 == 0) {
				deljivi3++;
			}
		}
		System.out.println("U nizu brojeva do " + n + ", parnih je " + parni + ", neparnih je " + neparni + ", dvocifrenih je " + dvocifreni + " a deljivih sa 3, " + deljivi3 + ".");
	}

}
