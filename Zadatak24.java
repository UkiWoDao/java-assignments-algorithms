package javapractice;

import java.util.Scanner;

public class Zadatak24 {

	public static void main(String[] args) {
		// TODO Suma prvih n prirodnih brojeva
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi n");
		
		int i = 1, zbir = 0, n = sc.nextInt();
		while (i <= n) {
			zbir += i;
			i++;
		}
		System.out.println(zbir);
	}

}
