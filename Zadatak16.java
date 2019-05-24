package javapractice;

import java.util.Scanner;

public class Zadatak16 {

	public static void main(String[] args) {
		// TODO Napisati program za ispis parnih prirodnih brojeva od 1 do n
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi n");
		int i = 1, n = sc.nextInt();
		
		while(i <= n) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
