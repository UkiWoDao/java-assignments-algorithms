package javapractice;

import java.util.Scanner;

public class Zadatak26 {

	public static void main(String[] args) {
		// TODO  	Izracunati i ispisati sumu kvadrata prvih n prirodnih brojeva
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi n");
		int i = 1, zbir = 0, n = sc.nextInt();
		
		while(i <= n) {
			zbir += i * i;
			i++;
		}
		System.out.println(zbir);
	}

}
