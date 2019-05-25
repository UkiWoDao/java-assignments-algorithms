package javapractice;

import java.util.Scanner;

public class Zadatak29 {

	public static void main(String[] args) {
		/* TODO Izracunati i ispisati sumu reciprocnih 
		 * vrijednosti prirodnih brojeva od k do n */
		Scanner sc = new Scanner(System.in);
		double k, n;
		System.out.println("Unesi k");
		k = sc.nextInt();
		System.out.println("Unesi n");
		n = sc.nextInt();
		
		double zbir = 0;
		
		while(k <= n) {
			zbir += 1/k;
			k++;
		}
		System.out.println(zbir);
	}

}
