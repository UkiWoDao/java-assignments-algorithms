package javapractice;

import java.util.Scanner;

public class Zadatak35 {

	public static void main(String[] args) {
		// TODO Izracunati sumu prirodnih brojeva u intervalu od 1 do n koji su djeljivi sa 7
		Scanner sc = new Scanner(System.in);
		int zbir = 0, i = 1, n = sc.nextInt(); 
		
		while(i <= n) {
			if(i % 7 == 0) {
				zbir += i;
			}
			i++;
		}
		System.out.println(zbir);
	}

}
