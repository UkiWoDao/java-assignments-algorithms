package javapractice;

import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) {
		// TODO Napisati program za ispis prvih n prirodnih brojeva unazad
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi n");
		int i = 1, n = sc.nextInt();
		while(i <= n) {
			System.out.println(n);
			n--;
		}	
	}

}
