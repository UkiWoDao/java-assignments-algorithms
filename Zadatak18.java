package javapractice;

import java.util.Scanner;

public class Zadatak18 {

	public static void main(String[] args) {
		// TODO Ispis prirodnih brojeva od 1 do n koji su djeljivi sa 5
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi n");
		int i = 1, n = sc.nextInt();
		
		while(i <= n) {
			if(i % 5 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
