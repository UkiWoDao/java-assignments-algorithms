package javapractice;

import java.util.Scanner;

public class Zadatak18_2 {

	public static void main(String[] args) {
		// TODO Ispis prirodnih brojeva od 1 do n koji su djeljivi sa a
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi n");
		int i = 1, n = sc.nextInt(); 
		System.out.println("Unesi a");
		int a = sc.nextInt();
		
		while(i <= n) {
			if(i % a == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
