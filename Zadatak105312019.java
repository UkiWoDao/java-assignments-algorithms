package uros;

import java.util.Scanner;

public class Zadatak105312019 {

	public static void main(String[] args) {
		// TODO Napisati metodu koja prima niz i vraca informaciju da li je taj niz rastuci.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Koliki je niz?");
		int n = sc.nextInt();
		
		int[]niz = new int[n];
		
		niz = ucitajNiz(n);
		if(proveraNiza(niz)) {
			System.out.println("Niz je rastuci");
		} else System.out.println("Niz nije rastuci");
	}
	
	static int[] ucitajNiz(int n) {
		Scanner sc = new Scanner(System.in);
		int[]a = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Unesi element niza");
			a[i] = sc.nextInt();
		}
		return a;
	}
	
	static boolean proveraNiza(int[]a) {
		int j = 0;
		for(int i = 1; i < a.length; i++, j++) {
			if(a[j] >= a[i]) {
				return false;
			}
		}
		return true;
	}
}
