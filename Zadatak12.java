package javapractice;

import java.util.Scanner;

public class Zadatak12 {

	public static void main(String[] args) {
		// TODO Napisati program za ispis dvostruke vrijednosti prvih n prirodnih brojeva
		Scanner sc = new Scanner(System.in);
		
		int i = 1, n = sc.nextInt();
		while(i <= n) {
			System.out.println(i * 2);
			i++;
		}
	}

}
