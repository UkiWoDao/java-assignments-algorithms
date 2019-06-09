package uros;

import java.util.Scanner;

public class Zadatak105232019 {

	public static void main(String[] args) {
		/* TODO Napisati program koji sabira sve parne 
		 * cifre a oduzima neparne cifre. 
			Unos: 1234
			Izlaz: 6 -4
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi broj");
		int n = sc.nextInt(), zbir = 0, raz = 0;
		
		while(n != 0) {
			int cifra = n % 10;
			n /= 10;
			if(cifra % 2 == 0) {
				zbir += cifra;
			} else {
				raz -= cifra;
			}
		}
		System.out.println("Zbir parnih cifara broja je " + zbir + ", a rezultat oduzimanja neparnih cifara istog broja je " + raz);
	}

}
