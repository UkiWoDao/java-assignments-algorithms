package javapractice;

import java.util.Scanner;

public class Zadatak30 {

	public static void main(String[] args) {
		/* TODO Napisati program za izracunavanje 
		sume niza:1 - 1/2 + 1/3 -+ ... -+ 1/n */
		Scanner sc = new Scanner(System.in);
		
		// declare and assign variables
		int n;
		double i = 1;
		double zbir = 0;
		int znak = 1;
		
		// prompt n
		System.out.println("Unesi n");
		n = sc.nextInt();

		
		while(i <= n) {
			zbir += znak * (1/i);
			znak = -znak;
			i++;
		}
		System.out.println(zbir);
	}

}
