package razniZadaci;

import java.util.Scanner;

public class ZadatakSrednji7 {

	public static void main(String[] args) {
		// TODO Napisati program koji ispisuje n fibonnacijevih brojeva
		// fibonacci niz 0 1 1 2 3 5 8...
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Koliko brojeva niza zelis?");
		int n =  sc.nextInt();
		int pret = 0, sled = 1, i = 1, zbir = 0;
		if(n == 1) {
			System.out.print(0);
		} else if(n == 2){
			System.out.print(0 + " " + 1);
		} else {
			System.out.print(pret + " " + sled + " ");
			while(i <= n) {
				zbir = pret + sled;
				pret = sled;
				sled = zbir;
				i++;
				System.out.print(sled + " ");
			}
		}
	}

}
