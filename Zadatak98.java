package javapractice;

import java.util.Scanner;

public class Zadatak98 {

	public static void main(String[] args) {
		/* TODO Napisati program koji ce za ucitanu vrijednost k 
		 * izracunati vrijednost izraza i ispisati:
		 * http://www.znanje.org/knjige/computer/Java/ib01/082Java/082_while_jav.php
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi k");
		int k = sc.nextInt(), i = 1, sqr, zbir = 0;
		
		while(i <= k) {
			if(i % 2 != 0) {
				sqr = i * i;
				zbir += sqr;
			}
			i++;
		}
		System.out.println("Rezultat je " + zbir);
		
	}

}
