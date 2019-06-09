package uros;

import java.util.Scanner;

public class Zadatak105282019 {

	public static void main(String[] args) {
		// TODO Napisati metodu koja za ucitani niz vraca sumu svih elemenata deljivih sa poslatim brojem K
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi K matori");
		int k = sc.nextInt();
			
		double rez = mehmedPasa(k);
		System.out.println(rez);
	}
	
	static double mehmedPasa(int osvajac) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Koliki je niz tebra?");
		int n = sc.nextInt(), zbir = 0;	
		int[] niz = new int[n];
		for(int i = 0; i < niz.length; i++) {
			System.out.println("Unesi elemente niza");
			niz[i] = sc.nextInt();
			zbir += niz[i];
		}	
		return zbir / osvajac;
	}

}
