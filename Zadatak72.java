package javapractice;

import java.util.Scanner;

public class Zadatak72 {

	public static void main(String[] args) {
		// TODO Izracunati aritmeticku sredinu prirodnih brojeva do 5
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi n");
		int i = 1, n = sc.nextInt();
		double sum = 0;
		
		while(i <= n) {
			sum += i;
			i++;
		}
		double aSred = sum/n;
		System.out.println("Aritmeticka sredina prirodnih brojeva do " + n + " je " + aSred);
	}

}
