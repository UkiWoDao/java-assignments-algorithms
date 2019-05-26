package javapractice;

import java.util.Scanner;

public class Zadatak90_09 {

	public static void main(String[] args) {
		/* TODO Napisati program za ispis trougla kao na 
		slici sa zeljenim brojem redova 
		http://www.znanje.org/knjige/computer/Java/ib01/082Java/082_while_jav.php */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Koliko redova?");
		int i = 1, n = sc.nextInt();
		
		while(i <= n) {
			int j = 0;
			while(j <= n - i) {
				System.out.print(" ");
				j++;
			}
			int k = 1;
			while(k <= i) {
				System.out.print("x");
				k++;
			}
			System.out.println();
			i++;
		}
		
	}

}
