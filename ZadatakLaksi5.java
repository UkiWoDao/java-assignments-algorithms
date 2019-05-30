package razniZadaci;

import java.util.Scanner;

public class ZadatakLaksi5 {

	public static void main(String[] args) {
		// TODO Napisati program koji daje rezultat stepenovanja broja x stepenom y bez koriscenja biblioteckih funkcija

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi x");
		int x = sc.nextInt();		
		System.out.println("Unesi y");
		int y = sc.nextInt();
		int power = 0;
		
		for(int i = 1; i < y; i++) {
			if(y == 0) {
				power = 1;
			} else {
				power = x * (x * i);
			}
		}
		
		System.out.println(power);
	}

}
