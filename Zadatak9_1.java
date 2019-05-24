package javapractice;

import java.util.Scanner;

public class Zadatak9_1 {

	public static void main(String[] args) {
		// TODO Napisati program za ispis prirodnih brojeva od 3 do n
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi n");
		int i = 3, n = sc.nextInt();
		while(i <= n) {
			System.out.println(i);
			i++;
		}
	}

}
