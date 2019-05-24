package javapractice;

import java.util.Scanner;

public class Zadatak25 {

	public static void main(String[] args) {
		// TODO Suma prirodnih brojeva od k do n
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi k");
		int k = sc.nextInt();
		System.out.println("Unesi n");
		int n = sc.nextInt();
		int zbir = 0;
		
		while (k <= n) {
			zbir += k;
			k++;
		}
		System.out.println(zbir);
	}

}
