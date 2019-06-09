package uros;

import java.util.Scanner;

public class Zadatak105302019 {

	public static void main(String[] args) {
		/* TODO Napisati metodu koja prima broj N i vraca vrednost koja 
		predstavlja sumu svih brojeva koji su delioci tog broja */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi N");
		int N = sc.nextInt();
		
		int rez = delioci(N);
		System.out.println(rez);
	}
	
	static int delioci(int n) {
		int suma = 0;
		for(int i = 1; i < n; i++) {
			if(n % i == 0) {
				suma += i;
			}
		}
		return suma + n;
	}

}
