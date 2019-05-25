package javapractice;

import java.util.Scanner;

public class Zadatak34 {

	public static void main(String[] args) {
		// TODO Izracunati sumu neparnih prirodnih brojeva u intervalu od k do n
		Scanner sc = new Scanner(System.in);
		int zbir = 0; 
		
		// prompt variables
		System.out.println("Unesi k");
		int k = sc.nextInt();
		System.out.println("Unesi n");
		int n = sc.nextInt(); 
		
		while(k <= n) {
			if(k % 2 != 0) {
				zbir += k;
			}
			k++;
		}
		System.out.println(zbir);
	
	}

}
