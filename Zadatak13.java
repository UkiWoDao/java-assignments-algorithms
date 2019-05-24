package javapractice;

import java.util.Scanner;

public class Zadatak13 {

	public static void main(String[] args) {
		// TODO Ispis kvadrata prirodnih brojeva do n
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi n");
		int i = 1, n = sc.nextInt();
		while(i <= n) {
			System.out.println(i * i);
			i++;
		}
	}

}
