package uros;

import java.util.Scanner;

public class Zadatak105272019 {

	public static void main(String[] args) {
		/* TODO Napisati metodu koja kao argumente prima poziciju 
		 * bele figure i poziciju crne kraljice. Metoda zatim vraca 
		 * indikator da li crna kraljica moze da pojede belu figuru. 
		Ako moze, ispisati "NOMNOM". U suprotnom ispisati "NE" */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi x poziciju crne kraljice");
		int xCk = sc.nextInt();
		System.out.println("Unesi y poziciju crne kraljice");
		int yCk = sc.nextInt();
		System.out.println("Unesi x poziciju bele figure");
		int xbf = sc.nextInt();
		System.out.println("Unesi y poziciju bele figure");
		int ybf = sc.nextInt();
		
		boolean rez = nomNom(xCk, yCk, xbf, ybf);
//		System.out.println(rez);
		
	}
	
	static boolean nomNom(int x1, int y1, int x2, int y2) {
		boolean flag = false;
		if(x1 == x2 && y1 == y2) {
			System.out.println("Jedno polje moze da sadrzi samo jednu figuru");
		} else {
			if(x1 == x2 || y1 == y2 || (x1 + y1 == x2 + y2) || (Math.abs(x1 - y1) == Math.abs(x2 - y2))) {
				System.out.println("NOMNOM");
				flag = true;
			} else {
				System.out.println("NE");
				flag = false;
			}
		}
		if(flag == true) {
			return true;
		} else {
			return false;
		}
		
	}

}
