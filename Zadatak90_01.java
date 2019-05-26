package javapractice;

import java.util.Scanner;

public class Zadatak90_01 {

	public static void main(String[] args) {
		/* TODO Napisati program za ispis pravouglog trougla 
		 * kao na slici sa željenim brojem redova
		 http://www.znanje.org/knjige/computer/Java/ib01/082Java/082_while_jav.php */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Koliko redova");
		int n = sc.nextInt(), i = 1;
		String x = "x";
		
		while(i <= n) {
			System.out.println(x);
			x += "x";
			i++;
		}
	}

}
