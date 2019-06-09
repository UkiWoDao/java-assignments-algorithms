package uros;

import java.util.Scanner;

public class Zadatak105242019 {

	public static void main(String[] args) {
		/* TODO Napisati metodu koja prima broj N. Metoda zatim sumira narednih N unetih brijeva i vraca njihovu sumu. 
		Pozvati metodu i ispisati njen rezultat. */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi N");
		int N = sc.nextInt();
		
		int rez = fantasticnaMetoda(N);	
		System.out.println("Rezultat je " + rez);
	}
	
	static int fantasticnaMetoda(int N) {
		Scanner sc = new Scanner(System.in);
		int i = 1, n, zbir = 0;
		while(i <= N) {
			System.out.println("A sada deder unesi n");
			n = sc.nextInt();
			i++;
			zbir += n;
		}
		return zbir;
	}

}
