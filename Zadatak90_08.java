package javapractice;

import java.util.Scanner;

public class Zadatak90_08 {

	public static void main(String[] args) {
		/* TODO Napisati program za ispis trougla 
		 * kao na slici sa zeljenim brojem redova
		 * http://www.znanje.org/knjige/computer/Java/ib01/082Java/082_while_jav.php
		 */
		Scanner sc = new Scanner(System.in);
		
		// declare variables
		int i, j, k, n;
		
		System.out.println("Koliko redova?");
		n = sc.nextInt();
		
		i = 1;
		while(i <= n) {
			j = 0;
			while(j <= n - i) {
				System.out.print(" ");
				j++;
			}
			k = 1;
			while(k <= i) {
				System.out.print("x");
				System.out.print(" ");
				k++;
			}
			System.out.println();
			i++;
		}
	}

}
